package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Sachini implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Sachini() {
        System.out.println("Sachini - Constructor");
    }

    @Override
    public void love() {
        System.out.println("Sachini loves him");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Sachini - BeanNameAware : ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Sachini - BeanFactoryAware : ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Sachini - ApplicationContextAware : ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Sachini - InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Sachini - DisposableBean");
    }
}
