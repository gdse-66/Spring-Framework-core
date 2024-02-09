package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBeanFour;
import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.edu.ijse")
//@ComponentScan(basePackages = {"lk","com"})
//@ComponentScan(basePackageClasses = {SpringBean.class, SpringBeanFour.class})
public class AppConfig {

//    public AppConfig() {
//        System.out.println("AppConfig instance is created");
//    }

//    @Bean
    @Bean("javaBean")
    @Scope("prototype")
    public JavaBean getJavaBean(){
        return new JavaBean();
    }
}
