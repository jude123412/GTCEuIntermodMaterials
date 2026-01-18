package gtceuim.api.util;

import gtceuim.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class IMLogger {

    public static Logger log = LogManager.getLogger(Tags.MODNAME);

    private IMLogger() {}

    public static void init(@NotNull Logger modLogger) {
        log = modLogger;
    }
}
