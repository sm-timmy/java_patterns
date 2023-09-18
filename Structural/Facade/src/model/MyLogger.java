package model;

import com.sun.tools.javac.Main;

import java.io.IOException;
import java.util.logging.*;

public class MyLogger {
    static Logger logger;

    static  {
        logger = Logger.getLogger(Main.class.getName());
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.INFO);
        FileHandler textFileHandler = null;
        try {
            textFileHandler = new FileHandler("./info.log", true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            textFileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(textFileHandler);
    }

    public static void Log(String message) {
        System.out.println(message);
        logger.log(new LogRecord(logger.getLevel(), message));
    }
}
