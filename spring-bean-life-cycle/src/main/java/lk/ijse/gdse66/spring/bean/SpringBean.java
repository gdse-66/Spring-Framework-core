package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("Instantiate");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware : " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware : " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Initializing Bean with Post Construct");
    }

    @PreDestroy
    public void disposable(){
        System.out.println("Disposable Bean with Pre Destroy");
    }
}
