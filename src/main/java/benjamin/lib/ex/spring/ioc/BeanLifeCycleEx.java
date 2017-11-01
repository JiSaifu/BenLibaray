package benjamin.lib.ex.spring.ioc;

import benjamin.lib.ex.AbstractEx;
import benjamin.lib.ex.spring.ioc.beanfactory.MyBeanPostProcessor;
import benjamin.lib.ex.spring.ioc.beanfactory.MyInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycleEx extends AbstractEx {

    private static void LifeCycleBeanFactory() {
        Resource res = new ClassPathResource("beans_c3.xml");
        BeanFactory bf = new XmlBeanFactory(res);

        // BeanPostProcessor及其子接口负责处理全局性功能，和Bean级生命接口负责内容不同
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        Plane plane1 = (Plane)bf.getBean("plane");
        plane1.introduce();
        plane1.setColor("Red");

        System.out.println(plane1.getBeanName());
        System.out.println(plane1.getBeanFactory() == bf);

        Plane plane2 = (Plane)bf.getBean("plane");
        System.out.println("plane1==plane2:" + (plane1 == plane2));

        ((XmlBeanFactory)bf).destroySingletons();
    }

    @Override
    public void doEx() {
        LifeCycleBeanFactory();
    }
}
