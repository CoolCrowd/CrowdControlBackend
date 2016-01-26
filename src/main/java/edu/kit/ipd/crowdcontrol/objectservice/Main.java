package edu.kit.ipd.crowdcontrol.objectservice;

import edu.kit.ipd.crowdcontrol.objectservice.crowdworking.PlatformManager;
import edu.kit.ipd.crowdcontrol.objectservice.database.DatabaseManager;
import edu.kit.ipd.crowdcontrol.objectservice.database.operations.NotificationRestOperations;
import edu.kit.ipd.crowdcontrol.objectservice.database.operations.PlatformOperations;
import edu.kit.ipd.crowdcontrol.objectservice.database.operations.TemplateOperations;
import edu.kit.ipd.crowdcontrol.objectservice.database.operations.WorkerOperations;
import edu.kit.ipd.crowdcontrol.objectservice.rest.Router;
import edu.kit.ipd.crowdcontrol.objectservice.rest.resources.NotificationResource;
import edu.kit.ipd.crowdcontrol.objectservice.rest.resources.PlatformResource;
import edu.kit.ipd.crowdcontrol.objectservice.rest.resources.TemplateResource;
import edu.kit.ipd.crowdcontrol.objectservice.rest.resources.WorkerResource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;

import javax.naming.NamingException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.util.function.Function;

/**
 * @author Niklas Keller
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        try (InputStream in = Main.class.getResourceAsStream("/config.properties")) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        Function<String, String> trimIfNotNull = s -> {
            if (s != null)
                return s.trim();
            else
                return s;
        };
        String url = trimIfNotNull.apply(properties.getProperty("database.url"));
        String username = trimIfNotNull.apply(properties.getProperty("database.username"));
        String password = trimIfNotNull.apply(properties.getProperty("database.password"));
        String databasePool = trimIfNotNull.apply(properties.getProperty("database.poolName"));

        SQLDialect dialect = SQLDialect.valueOf(properties.getProperty("database.dialect").trim());
        DatabaseManager databaseManager = null;
        try {
            databaseManager = new DatabaseManager(username, password, url, databasePool, dialect);
            databaseManager.initDatabase();
            boot(databaseManager);
        } catch (NamingException | SQLException e) {
            System.err.println("unable to establish database connection");
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private static void boot(DatabaseManager databaseManager) {

        PlatformManager platformManager = null; // TODO

        TemplateOperations templateOperations = new TemplateOperations(context);
        NotificationRestOperations notificationRestOperations = new NotificationRestOperations(context);
        PlatformOperations platformOperations = new PlatformOperations(context);
        WorkerOperations workerOperations = new WorkerOperations(context);

        new Router(
                new TemplateResource(templateOperations),
                new NotificationResource(notificationRestOperations),
                new PlatformResource(platformOperations),
                new WorkerResource(workerOperations, platformManager)
        ).init();
    }
}
