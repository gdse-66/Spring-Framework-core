package lk.ijse.gdse66.spring.bean;

import org.springframework.context.annotation.Bean;

public class SpringBean2 {

    public SpringBean2(SpringBean4 springBean4) {
        System.out.println("SpringBean2() - Constructor: " + springBean4);
    }

    /* does not create an instance from SpringBean3 because
    * SpringBean2 class is not a component and it is not scanned
    * during scanning components*/
    /*@Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }*/
}
