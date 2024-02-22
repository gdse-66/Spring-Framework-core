package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.ijse.gdse66.spring.bean")
@ImportResource("classpath:context.xml")
@Import({DAOConfig.class, BOConfig.class})
public class AppConfig {
}
