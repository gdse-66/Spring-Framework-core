package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.dao.DAOSpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOConfig {

    @Bean
    public DAOSpringBean daoSpringBean(){
        return new DAOSpringBean();
    }
}
