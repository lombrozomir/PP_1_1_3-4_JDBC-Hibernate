package jm.task.core.jdbc.util;

import java.util.logging.Logger;

public abstract class BaseLogger {
    public static final Logger logger = Logger.getLogger(BaseLogger.class.getName());
    private BaseLogger() {

    }
}
