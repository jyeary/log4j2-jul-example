package com.bluelotussoftware.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0
 */
public class Main {

    /*
     * Use either -Djava.util.logging.manager=org.apache.logging.log4j.jul.LogManager
     * or uncomment the static initializer below.
     */
//    static {
//        System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");
//    }

    // This is the standard Log4J logger which is used as a reference.
    public static final Logger LOGGER = LogManager.getLogger();
    
    // This is the JUL Adapter implemented for this class.
    public static final java.util.logging.Logger JULI = 
            org.apache.logging.log4j.jul.LogManager.getLogManager().getLogger(Main.class.getName());

    public static void main(String[] args) {
        Main.LOGGER.trace("This is a trace message");
        Main.LOGGER.debug("This is a debug message.");
        Main.LOGGER.info("This is an info message.");
        Main.LOGGER.warn("This is a warning message.");
        Main.LOGGER.error("This is an error message.");
        Main.LOGGER.fatal("This is a fatal message.");

        Main.JULI.severe("JULI severe --> error");
        Main.JULI.warning("JULI warning --> warn");
        Main.JULI.info("JULI info --> info");
        Main.JULI.config("JULI config --> ???");
        Main.JULI.fine("JULI debug --> debug");
        Main.JULI.finer("JULI finer --> trace");
        Main.JULI.finest("JULI finest --> ???");

    }
}
