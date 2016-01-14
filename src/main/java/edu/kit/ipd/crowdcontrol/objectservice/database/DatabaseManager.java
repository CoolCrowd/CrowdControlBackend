package edu.kit.ipd.crowdcontrol.objectservice.database;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * initializes and holds the connection to the database and eventually the database itself.
 * @author LeanderK
 * @version 1.0
 */
public class DatabaseManager {
    private final Connection connection;
    private final DSLContext context;
    private final String url;

    /**
     * creates new DatabaseManager
     * @param userName the username for the database
     * @param password the password for the database
     * @param url the url to the database
     * @param sqlDialect the dialect to use
     * @throws SQLException if there was a problem establishing a connection to the database
     */
    public DatabaseManager(String userName, String password, String url, SQLDialect sqlDialect) throws SQLException {
        this.url = url;
        connection = DriverManager.getConnection(url, userName, password);
        context = DSL.using(connection, sqlDialect);
        initDatabase();
    }

    /**
     * initializes the database if not already initialized.
     */
    private void initDatabase() {
        String sql = "-- MySQL Script generated by MySQL Workbench\n" +
                "-- Thu Jan 14 22:13:36 2016\n" +
                "-- Model: New Model    Version: 1.0\n" +
                "-- MySQL Workbench Forward Engineering\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Schema mydb\n" +
                "-- -----------------------------------------------------\n" +
                "-- -----------------------------------------------------\n" +
                "-- Schema crowdcontrol\n" +
                "-- -----------------------------------------------------\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Schema crowdcontrol\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE SCHEMA IF NOT EXISTS `crowdcontrol` DEFAULT CHARACTER SET utf8mb4 ;\n" +
                "USE `crowdcontrol` ;\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Template`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Template` (\n" +
                "  `idTemplate` INT NOT NULL,\n" +
                "  `template` LONGTEXT NOT NULL,\n" +
                "  `titel` VARCHAR(255) NULL,\n" +
                "  `answer_type` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`idTemplate`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Experiment`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Experiment` (\n" +
                "  `idexperiment` INT(11) NOT NULL,\n" +
                "  `rating_options` JSON NULL DEFAULT NULL,\n" +
                "  `titel` VARCHAR(255) NULL DEFAULT NULL,\n" +
                "  `description` TEXT NULL DEFAULT NULL,\n" +
                "  `ratings_per_answer` INT(11) NULL DEFAULT NULL,\n" +
                "  `algorithm_task_chooser` VARCHAR(255) NULL DEFAULT NULL,\n" +
                "  `algorithm_quality_answer` VARCHAR(255) NULL DEFAULT NULL,\n" +
                "  `algorithm_quality_rating` VARCHAR(255) NULL DEFAULT NULL,\n" +
                "  `base_payment` INT(11) NULL DEFAULT NULL,\n" +
                "  `bonus_answer` INT(11) NULL DEFAULT NULL,\n" +
                "  `bonus_rating` INT(11) NULL DEFAULT NULL,\n" +
                "  `template_data` MEDIUMTEXT NULL DEFAULT NULL,\n" +
                "  `template` INT NULL,\n" +
                "  `answer_type` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`idexperiment`),\n" +
                "  INDEX `usedTemplate_idx` (`template` ASC),\n" +
                "  CONSTRAINT `usedTemplate`\n" +
                "    FOREIGN KEY (`template`)\n" +
                "    REFERENCES `crowdcontrol`.`Template` (`idTemplate`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Platform`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Platform` (\n" +
                "  `idPlatform` VARCHAR(255) NOT NULL,\n" +
                "  `name` VARCHAR(255) NOT NULL,\n" +
                "  `render_calibrations` BIT(1) NOT NULL,\n" +
                "  `needs_email` BIT(1) NOT NULL,\n" +
                "  PRIMARY KEY (`idPlatform`),\n" +
                "  UNIQUE INDEX `idPlatform_UNIQUE` (`idPlatform` ASC))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Task`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Task` (\n" +
                "  `idTask` INT(11) NOT NULL,\n" +
                "  `experiment` INT(11) NOT NULL,\n" +
                "  `running` BIT(1) NOT NULL,\n" +
                "  `platform_data` MEDIUMTEXT NULL DEFAULT NULL,\n" +
                "  `crowd_platform` VARCHAR(255) NOT NULL,\n" +
                "  `stopping` BIT(1) NOT NULL,\n" +
                "  PRIMARY KEY (`idTask`),\n" +
                "  INDEX `idexperiment_idx` (`experiment` ASC),\n" +
                "  INDEX `runningOnPlattform_idx` (`crowd_platform` ASC),\n" +
                "  CONSTRAINT `idexperimenthit`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`idexperiment`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT,\n" +
                "  CONSTRAINT `runningOnPlattform`\n" +
                "    FOREIGN KEY (`crowd_platform`)\n" +
                "    REFERENCES `crowdcontrol`.`Platform` (`idPlatform`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Worker`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Worker` (\n" +
                "  `idWorker` INT(11) NOT NULL,\n" +
                "  `identification` VARCHAR(255) NULL DEFAULT NULL,\n" +
                "  `platform` VARCHAR(255) NOT NULL,\n" +
                "  `email` VARCHAR(255) NULL,\n" +
                "  PRIMARY KEY (`idWorker`),\n" +
                "  INDEX `workerOrigin_idx` (`platform` ASC),\n" +
                "  CONSTRAINT `workerOrigin`\n" +
                "    FOREIGN KEY (`platform`)\n" +
                "    REFERENCES `crowdcontrol`.`Platform` (`idPlatform`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Answer`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Answer` (\n" +
                "  `idAnswer` INT(11) NOT NULL,\n" +
                "  `task` INT(11) NOT NULL,\n" +
                "  `answer` MEDIUMTEXT NOT NULL,\n" +
                "  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                "  `worker_id` INT(11) NOT NULL,\n" +
                "  `quality` INT NULL,\n" +
                "  PRIMARY KEY (`idAnswer`),\n" +
                "  INDEX `workerAnswered_idx` (`worker_id` ASC),\n" +
                "  INDEX `idHITanswers_idx` (`task` ASC),\n" +
                "  CONSTRAINT `idHITanswers`\n" +
                "    FOREIGN KEY (`task`)\n" +
                "    REFERENCES `crowdcontrol`.`Task` (`idTask`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `workerAnswered`\n" +
                "    FOREIGN KEY (`worker_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`idWorker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Constraint`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Constraint` (\n" +
                "  `idConstraint` INT(11) NOT NULL,\n" +
                "  `constraint` VARCHAR(45) NOT NULL,\n" +
                "  `experiment` INT(11) NOT NULL,\n" +
                "  PRIMARY KEY (`idConstraint`),\n" +
                "  INDEX `constrainedExperiment` (`experiment` ASC),\n" +
                "  CONSTRAINT `constrainedExperiment`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`idexperiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`GiftCode`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`GiftCode` (\n" +
                "  `idGiftCode` INT NOT NULL,\n" +
                "  `code` MEDIUMTEXT NOT NULL,\n" +
                "  `amount` INT NOT NULL,\n" +
                "  PRIMARY KEY (`idGiftCode`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Payment`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Payment` (\n" +
                "  `idPayment` INT(11) NOT NULL,\n" +
                "  `worker_id` INT(11) NOT NULL,\n" +
                "  `experiment_id` INT(11) NOT NULL,\n" +
                "  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                "  `amount` INT NOT NULL,\n" +
                "  `giftcode` INT NULL,\n" +
                "  PRIMARY KEY (`idPayment`),\n" +
                "  INDEX `payedWorker_idx` (`worker_id` ASC),\n" +
                "  INDEX `payedExperiment_idx` (`experiment_id` ASC),\n" +
                "  INDEX `usedGiftCode_idx` (`giftcode` ASC),\n" +
                "  CONSTRAINT `payedExperiment`\n" +
                "    FOREIGN KEY (`experiment_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`idexperiment`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT,\n" +
                "  CONSTRAINT `payedWorker`\n" +
                "    FOREIGN KEY (`worker_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`idWorker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `usedGiftCode`\n" +
                "    FOREIGN KEY (`giftcode`)\n" +
                "    REFERENCES `crowdcontrol`.`GiftCode` (`idGiftCode`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Population`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Population` (\n" +
                "  `idPopulation` INT(11) NOT NULL,\n" +
                "  `property` VARCHAR(255) NOT NULL,\n" +
                "  `description` VARCHAR(255) NULL,\n" +
                "  `name` VARCHAR(255) NOT NULL,\n" +
                "  `experiment` INT NULL,\n" +
                "  PRIMARY KEY (`idPopulation`),\n" +
                "  UNIQUE INDEX `experiment_UNIQUE` (`experiment` ASC),\n" +
                "  CONSTRAINT `participatedIn`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`idexperiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Rating`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Rating` (\n" +
                "  `idRating` INT(11) NOT NULL,\n" +
                "  `task` INT(11) NOT NULL,\n" +
                "  `answer_r` INT(11) NOT NULL,\n" +
                "  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
                "  `rating` INT(11) NULL DEFAULT NULL,\n" +
                "  `worker_id` INT(11) NOT NULL,\n" +
                "  `quality` INT NULL,\n" +
                "  PRIMARY KEY (`idRating`),\n" +
                "  INDEX `idAnswers_idx` (`answer_r` ASC),\n" +
                "  INDEX `workerRated_idx` (`worker_id` ASC),\n" +
                "  INDEX `idHITrating_idx` (`task` ASC),\n" +
                "  CONSTRAINT `idAnswersratins`\n" +
                "    FOREIGN KEY (`answer_r`)\n" +
                "    REFERENCES `crowdcontrol`.`Answer` (`idAnswer`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `idHITrating`\n" +
                "    FOREIGN KEY (`task`)\n" +
                "    REFERENCES `crowdcontrol`.`Task` (`idTask`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `workerRated`\n" +
                "    FOREIGN KEY (`worker_id`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`idWorker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Tag`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Tag` (\n" +
                "  `idTag` INT(11) NOT NULL,\n" +
                "  `tag` VARCHAR(255) NOT NULL,\n" +
                "  `experiment` INT(11) NOT NULL,\n" +
                "  PRIMARY KEY (`idTag`),\n" +
                "  INDEX `idexperiment_idx` (`experiment` ASC),\n" +
                "  CONSTRAINT `idexperimenttags`\n" +
                "    FOREIGN KEY (`experiment`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`idexperiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8mb4;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`PopulationAnswerOption`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`PopulationAnswerOption` (\n" +
                "  `idPopulationAnswerOption` INT NOT NULL,\n" +
                "  `population` INT NOT NULL,\n" +
                "  `answer` VARCHAR(255) NOT NULL,\n" +
                "  PRIMARY KEY (`idPopulationAnswerOption`),\n" +
                "  INDEX `populationAnswer_idx` (`population` ASC),\n" +
                "  CONSTRAINT `populationAnswer`\n" +
                "    FOREIGN KEY (`population`)\n" +
                "    REFERENCES `crowdcontrol`.`Population` (`idPopulation`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`ExperimentsPopulation`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`ExperimentsPopulation` (\n" +
                "  `idExperimentsPopulation` VARCHAR(255) NOT NULL,\n" +
                "  `population_user` INT NOT NULL,\n" +
                "  `answer` INT NOT NULL,\n" +
                "  `referenced_platform` VARCHAR(255) NOT NULL,\n" +
                "  `not` BIT(1) NOT NULL,\n" +
                "  PRIMARY KEY (`idExperimentsPopulation`),\n" +
                "  INDEX `populationUser_idx` (`population_user` ASC),\n" +
                "  INDEX `referencedPlatform_idx` (`referenced_platform` ASC),\n" +
                "  INDEX `referencedAnswer_idx` (`answer` ASC),\n" +
                "  CONSTRAINT `populationUser`\n" +
                "    FOREIGN KEY (`population_user`)\n" +
                "    REFERENCES `crowdcontrol`.`Experiment` (`idexperiment`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `referencedPlatform`\n" +
                "    FOREIGN KEY (`referenced_platform`)\n" +
                "    REFERENCES `crowdcontrol`.`Platform` (`idPlatform`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT,\n" +
                "  CONSTRAINT `referencedAnswer`\n" +
                "    FOREIGN KEY (`answer`)\n" +
                "    REFERENCES `crowdcontrol`.`PopulationAnswerOption` (`idPopulationAnswerOption`)\n" +
                "    ON DELETE RESTRICT\n" +
                "    ON UPDATE RESTRICT)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`PopulationResult`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`PopulationResult` (\n" +
                "  `idPopulationResult` INT NOT NULL,\n" +
                "  `worker` INT NOT NULL,\n" +
                "  `answer` INT NOT NULL,\n" +
                "  PRIMARY KEY (`idPopulationResult`),\n" +
                "  INDEX `referencedAnswer_idx` (`answer` ASC),\n" +
                "  INDEX `referencedWorker_idx` (`worker` ASC),\n" +
                "  CONSTRAINT `chosenAnswer`\n" +
                "    FOREIGN KEY (`answer`)\n" +
                "    REFERENCES `crowdcontrol`.`PopulationAnswerOption` (`idPopulationAnswerOption`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `referencedWorker`\n" +
                "    FOREIGN KEY (`worker`)\n" +
                "    REFERENCES `crowdcontrol`.`Worker` (`idWorker`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE)\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "\n" +
                "-- -----------------------------------------------------\n" +
                "-- Table `crowdcontrol`.`Notification`\n" +
                "-- -----------------------------------------------------\n" +
                "CREATE TABLE IF NOT EXISTS `crowdcontrol`.`Notification` (\n" +
                "  `idNotification` INT NOT NULL,\n" +
                "  `name` VARCHAR(45) NOT NULL,\n" +
                "  `description` VARCHAR(255) NOT NULL,\n" +
                "  `checkPeriod` INT NOT NULL,\n" +
                "  `sendThreshold` INT NOT NULL,\n" +
                "  `query` MEDIUMTEXT NOT NULL,\n" +
                "  `lastSent` TIMESTAMP NULL,\n" +
                "  PRIMARY KEY (`idNotification`))\n" +
                "ENGINE = InnoDB;\n" +
                "\n" +
                "USE `crowdcontrol`;\n" +
                "\n" +
                "DELIMITER $$\n" +
                "USE `crowdcontrol`$$\n" +
                "CREATE DEFINER = CURRENT_USER TRIGGER `crowdcontrol`.`Platform_BEFORE_INSERT` BEFORE INSERT ON `Platform` FOR EACH ROW\n" +
                "BEGIN\n" +
                "\tIF REGEXP_LIKE (NEW.idPlatform, '[a-z0-9._-]+') THEN\n" +
                "\t\tSET NEW.idPlatform = LOWER(NEW.idPlatform);\n" +
                "\tELSE\n" +
                "\t\tSET NEW.idPlatform = NULL;\n" +
                "\tEND IF;\n" +
                "END$$\n" +
                "\n" +
                "\n" +
                "DELIMITER ;";
        context.fetch(sql);
    }

    /**
     * returns the Context used to communicate with the database
     * @return an instance of DSLContext
     */
    public DSLContext getContext() {
        return context;
    }

    /**
     * returns the Connection used to communicate with the database.
     * @return an instance of Connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * returns the URL to the database
     * @return the url as a String
     */
    public String getUrl() {
        return url;
    }
}
