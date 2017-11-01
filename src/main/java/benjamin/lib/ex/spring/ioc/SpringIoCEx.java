package benjamin.lib.ex.spring.ioc;

import benjamin.lib.ex.AbstractEx;
import benjamin.lib.ex.reflection.Plane;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class SpringIoCEx extends AbstractEx {

    @Override
    public void doEx() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("beans_c3.xml");
        BeanFactory bf = new XmlBeanFactory(res);

        Plane planeB = bf.getBean("plane1", Plane.class);
        System.out.println(planeB.getBrand());

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Plane planeA = ctx.getBean("plane", Plane.class);
        System.out.println(planeA.getBrand());
    }
}
