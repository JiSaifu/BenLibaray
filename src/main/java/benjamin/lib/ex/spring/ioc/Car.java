package benjamin.lib.ex.spring.ioc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.*;

import java.util.Set;

// 管理Bean生命周期的接口
// Bean级生命周期接口解决Bean个性化处理的问题
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    @Setter @Getter
    private String brand;

    @Setter @Getter
    private String color;

    @Setter @Getter
    private int maxSpeed;

    @Setter @Getter
    private Set<String> gear;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("Call Car's Constructor");
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void introduce() {
        System.out.println("brand:" + brand + "; color:" + color + "; maxSpeed:" + maxSpeed);
    }

    // BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("Call BeanFactoryAware.setBeanFactory().");
        this.beanFactory = beanFactory;
    }

    // BeanNameAware接口方法
    @Override
    public void setBeanName(String beanName) {
        System.out.println("Call BeanNameAware.setBeanName().");
        this.beanName = beanName;
    }

    // InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Call InitializingBean.afterPropertiesSet()");
    }

    // DisposableBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("Call DisposableBean.destroy()");
    }

    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("调用init-method所指定的myInit(), 将maxSpeed设置为240");
        this.maxSpeed = 240;
    }

    // 通过<bean>的destroy-method属性指定的销毁方法
    public void myDestory() {
        System.out.println("调用destroy-method所指定的myDestroy()");
    }
}
