package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public String myString(){
        return "Amal";
    }

    @Bean
    public Integer myInt(){
        return 21;
    }

    @Bean
    public Boolean myBoolean(){
        return true;
    }
}
