package benjamin.lib.ex;

// import benjamin.lib.ex.classloader.ClassLoaderEx;
import benjamin.lib.ex.collection.CollectionEx;
import benjamin.lib.ex.log4j.Log4jEx;
import benjamin.lib.ex.lombok.LombokEx;
import benjamin.lib.ex.reflection.ReflectionEx;
import benjamin.lib.ex.resource.ResourceEx;
import benjamin.lib.ex.spring.ioc.BeanLifeCycleEx;
import benjamin.lib.ex.spring.ioc.SpringIoCAdvEx;
import benjamin.lib.ex.spring.ioc.SpringIoCEx;

public class ExExecuter {
    public static void main(String[] args) {
        // AbstractEx ex = new BeanLifeCycleEx();
        AbstractEx ex = new SpringIoCAdvEx();
        // AbstractEx ex = new LombokEx("aaa");
        // AbstractEx ex = new SpringIoCEx();
        // AbstractEx ex = new ResourceEx();
        // AbstractEx ex = new CollectionEx();
        // AbstractEx ex = new ClassLoaderEx();
        ex.doEx();
    }
}
