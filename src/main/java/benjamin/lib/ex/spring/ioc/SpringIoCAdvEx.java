package benjamin.lib.ex.spring.ioc;

import benjamin.lib.ex.AbstractEx;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.util.List;

public class SpringIoCAdvEx extends AbstractEx {

    @Override
    public void doEx() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("beans_c4.xml");
        BeanFactory bf = new XmlBeanFactory(res);

        Car car = bf.getBean("car", Car.class);
        System.out.println(car.getBrand());
        System.out.println(car.getColor());

        ClassPathXmlApplicationContext pf = new ClassPathXmlApplicationContext(
                new String[]{"beans_c4.xml"});
        ApplicationContext sf = new ClassPathXmlApplicationContext(
                new String[]{"beans_c4-1.xml"}, pf);

        Boss boss = (Boss)sf.getBean("boss");
        System.out.println(boss.getCar1().getBrand());
        System.out.println(boss.getCar2().getBrand());
        System.out.println(boss.getPlane().getBrand());

        for(String gear : boss.getCar2().getGear()) {
            System.out.println(gear);
        }

        for(String favorite : boss.getFavorites()) {
            System.out.println(favorite);
        }
        System.out.println(boss.getJobs().get("AM"));
        System.out.println(boss.getJobs().get("PM"));

        System.out.println(boss.getMails().getProperty("jobMail"));

        for(Object flEntity : sf.getBean("favoriteList1", List.class)) {
            System.out.println((String)flEntity);
        }

        Boss boss2 = (Boss)sf.getBean("boss2");
        System.out.println(boss2.getCar1().getColor());

        Boss boss3 = (Boss)sf.getBean("boss3");
        System.out.println(boss3.getCar1().getBrand());
    }
}
