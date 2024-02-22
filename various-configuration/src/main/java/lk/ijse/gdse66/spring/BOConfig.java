package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bo.BOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BOConfig {

    @Bean
    public BOSpringBean boSpringBean(){
        return new BOSpringBean();
    }
}
