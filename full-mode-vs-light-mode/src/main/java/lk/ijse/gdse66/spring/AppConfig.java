package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean2;
import lk.ijse.gdse66.spring.bean.SpringBean4;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {

    /* SpringBean2 is in full mode*/
    @Bean
    public SpringBean2 springBean2(){
        System.out.println("springBean2() method is invoked");
        springBean4();
        springBean4();
        springBean4();
        /*myString();
        myString();
        myString();*/
        return new SpringBean2(springBean4());
    }

    /* SpringBean4 is in full mode*/
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SpringBean4 springBean4(){
        System.out.println("springBean4() method is invoked");
        return new SpringBean4();
    }

    public String myString(){
        System.out.println("myString() method is invoked");
        return "IJSE";
    }
}
