package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.ijse.gdse66.spring.bean")
@ImportResource("classpath:context.xml")/* import xml-based configuration files */
@Import({DAOConfig.class, BOConfig.class}) /* import another configuration classes into a single configuration class*/
public class AppConfig {
}
