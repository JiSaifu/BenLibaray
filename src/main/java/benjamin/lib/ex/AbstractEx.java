package benjamin.lib.ex;

import org.apache.log4j.Logger;

public abstract class AbstractEx {
    Logger logger = Logger.getLogger("log4jexLogger");

    public abstract void doEx();

    public void endMethod(String methodName) {
        logger.debug(methodName + ": end");
    }
}
