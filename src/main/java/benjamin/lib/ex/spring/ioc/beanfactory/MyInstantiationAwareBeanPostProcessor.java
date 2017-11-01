package benjamin.lib.ex.spring.ioc.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor
        extends InstantiationAwareBeanPostProcessorAdapter {

    // 抽象类方法，在实例化Bean之前进行调用
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName)
            throws BeansException {
        // 仅对容器中car bean进行处理
        if ("plane".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcess#" +
                    "postProcessBeforeInstantiation");
        }
        return null;
    }

    // 抽象类方法，在实例化Bean之后进行调用
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName)
        throws BeansException {
        if ("plane".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcess#" +
                    "postProcessAfterInstantiation");
        }
        return true;
    }

    @Override
    // 抽象类方法，在设定Bean属性之前进行调用
    public PropertyValues postProcessPropertyValues(PropertyValues pvs,
                                                   PropertyDescriptor[] pds,
                                                   Object bean,
                                                   String beanName
                                                   ) throws BeansException {
        if ("plane".equals(beanName)) {
            System.out.println("InstantiationAwareBeanPostProcess#" +
                    "postProcessPropertyValues");
        }
        return pvs;
    }
}
