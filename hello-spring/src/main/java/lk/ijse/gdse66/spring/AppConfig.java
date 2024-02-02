package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
//@ComponentScan(basePackages = "lk.ijse.gdse66.spring.bean")
@ComponentScan(basePackageClasses = SpringBean.class)
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig instance is created");
    }
}
