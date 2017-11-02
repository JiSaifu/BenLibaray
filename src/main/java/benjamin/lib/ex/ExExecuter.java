package benjamin.lib.ex;

// import benjamin.lib.ex.classloader.ClassLoaderEx;
import benjamin.lib.ex.spring.ioc.EventEx;
import benjamin.lib.ex.spring.ioc.I18nEx;

public class ExExecuter {
    public static void main(String[] args) {
        AbstractEx ex =
//                new I18nEx();
                new EventEx();
        // AbstractEx ex = new BeanLifeCycleEx();
        // AbstractEx ex = new SpringIoCAdvEx();
        // AbstractEx ex = new LombokEx("aaa");
        // AbstractEx ex = new SpringIoCEx();
        // AbstractEx ex = new ResourceEx();
        // AbstractEx ex = new CollectionEx();
        // AbstractEx ex = new ClassLoaderEx();
        ex.doEx();
    }
}
