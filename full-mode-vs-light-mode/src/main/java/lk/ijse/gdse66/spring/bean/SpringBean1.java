package lk.ijse.gdse66.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/* SpringBean1 is in full mode */
@Component
public class SpringBean1 {
    public SpringBean1() {
        System.out.println("SpringBean1() - Constructor");
    }

    /* SpringBean3 is in light mode */
    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }

    /*@Bean
    public SpringBean2 springBean2(){
        System.out.println("springBean2() method is invoked");
        springBean4();
        springBean4();
        springBean4();
        return new SpringBean2(springBean4());
    }

    @Bean
    public SpringBean4 springBean4(){
        System.out.println("springBean4() method is invoked");
        return new SpringBean4();
    }*/
}
