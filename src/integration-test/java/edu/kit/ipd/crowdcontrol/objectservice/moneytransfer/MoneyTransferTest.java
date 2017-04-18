package edu.kit.ipd.crowdcontrol.objectservice.moneytransfer;

import edu.kit.ipd.crowdcontrol.objectservice.Main;
import edu.kit.ipd.crowdcontrol.objectservice.moneytransfer.MoneyTransferManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.appender.WriterAppender;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by frittler on 23.03.16.
 */

public class MoneyTransferTest {

    boolean additivity;
    Logger logger;
    WriterAppender writerAppender;
    ConsoleAppender consoleAppender;
    StringWriter writer;

    @Before
    public void setUp() throws Exception {
        logger = (Logger) LogManager.getLogger(MoneyTransferManager.class);
        consoleAppender = ConsoleAppender.createDefaultAppenderForLayout(PatternLayout.createDefaultLayout());
        consoleAppender.start();
        logger.addAppender(consoleAppender);
        WriterAppender.Builder builder = WriterAppender.newBuilder();
        builder.setLayout(PatternLayout.createDefaultLayout());
        writer = new StringWriter();
        builder.setTarget(writer);
        builder.setName("Writer");
        writerAppender = builder.build();
        writerAppender.start();
        logger.addAppender(writerAppender);
        additivity = logger.isAdditive();
        logger.setAdditive(false);
        Main.main(null);
    }

    @Test
    public void test() throws Exception {
        Thread.sleep(10000);

        assertTrue(writer.toString().contains("Started submission of giftcodes to workers."));
        assertTrue(writer.toString().contains("Completed submission of giftcodes to workers."));
    }

    @After
    public void tearDown() {
        logger.removeAppender(writerAppender);
        logger.removeAppender(consoleAppender);
        logger.setAdditive(additivity);
    }
}
