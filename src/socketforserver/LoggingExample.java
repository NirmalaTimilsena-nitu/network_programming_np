package socketforserver;

import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.severe("This is a severe message");
        logger.warning("This is a warning message");
        logger.info("This is an informational message");
        logger.config("This is a configuration message");
        logger.fine("This is a fine message");
        logger.finer("This is a finer message");
        logger.finest("This is the finest message");
    }
}

