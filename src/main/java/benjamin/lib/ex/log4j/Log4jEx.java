package benjamin.lib.ex.log4j;

import benjamin.lib.ex.AbstractEx;
import org.apache.log4j.*;

public class Log4jEx extends AbstractEx{
    @Override
    public void doEx() {
        // DEBUG が最も低いレベルで、FATAL が最高のレベルということになります。
        // DEBUG　＜　INFO　＜　WARN　＜　ERROR　＜　FATAL
        // Logger logger = Logger.getLogger(Log4jEx.class);
        Logger logger = Logger.getLogger("log4jexLogger");
        // Appender appender = new ConsoleAppender();
        // PatternLayout layout = new PatternLayout();
        // layout.setConversionPattern("%-4r [%t] %-5p %c %x - %m%n");

        // AppenderとLayoutをデフォルトに設定する。
        // BasicConfigurator.configure();
        // logger.setLevel(Level.FATAL);
        // logger.addAppender(appender);

        // PropertyConfigurator.configure("log4j.properties");

        logger.debug("This is debug log.");
        logger.info("This is info log.");
        logger.warn("This is warn log.");
        logger.error("This is error log.");
        logger.fatal("This is fatal log.");
    }
}
