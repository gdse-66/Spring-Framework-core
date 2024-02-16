package lk.ijse.gdse66.spring.bean;

import lk.ijse.gdse66.spring.util.Injector;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("Lahiru")
public class Boy implements /*Injector,*/ BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    /* property/field injection */
    /*@Autowired
    private GoodGirl gf;*/

    /* setter method injection */
    /*private GoodGirl gf;

    @Autowired
    public void setGoodGirl(GoodGirl gf){
        this.gf = gf;
    }*/

    /* interface through injection */
    /*private GoodGirl gf;

    @Autowired
    @Override
    public void inject(GoodGirl gf) {
        this.gf = gf;
    }*/

    /* constructor injection */
    private GoodGirl gf;

    @Autowired
    public Boy(GoodGirl gf) {
        this.gf = gf;
        System.out.println("Boy(GoodGirl gf) - Constructor");
        System.out.println("Constructor - Have I got a girl friend? " + gf);
        gf.love();
    }

    public Boy() {
        System.out.println("Boy() - Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Boy - BeanNameAware : ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy - BeanFactoryAware : ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy - ApplicationContextAware : ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy - InitializingBean");
        System.out.println("Have I got a girl friend? " + gf);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy - DisposableBean");
    }
}
