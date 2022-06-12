package xyz.nikitacartes.easyauth.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EasyLogger {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void logError(String error) {
        LOGGER.error("[EasyAuth] " + error);
    }

    public static void logInfo(String info) {
        LOGGER.info("[EasyAuth] " + info);
    }

    public static void logWarn(String info) {
        LOGGER.warn("[EasyAuth] " + info);
    }

}
