package benjamin.lib.ex.spring.ioc.beanfactory;

import benjamin.lib.ex.spring.ioc.Plane;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        if ("Plane".equals(beanName)) {
            Plane plane = (Plane)bean;
            if (plane.getColor() == null) {
                System.out.println("调用BeanPostProcess" +
                        "#postProcessBeforeInitialization");
                plane.setColor("Black");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        if("plane".equals(beanName)) {
            Plane plane = (Plane)bean;
            if(plane.getMaxSpeed() > 200) {
                System.out.println("调用BeanPostProcess#" +
                        "postProcessAfterInitialization:" +
                        "将maxSpeed调整为200");
                plane.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
