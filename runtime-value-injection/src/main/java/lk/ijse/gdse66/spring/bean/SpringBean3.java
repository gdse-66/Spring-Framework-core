package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringBean3 {

    @Autowired
    private Environment env;

    public SpringBean3() {
        System.out.println("SpringBean3() - Constructor");
    }

    @PostConstruct
    public void initialize(){
        System.out.println(env.getProperty("USERNAME"));
        System.out.println(env.getProperty("HOME"));
        System.out.println(env.getProperty("os.name"));
        System.out.println(env.getProperty("java.version"));
        System.out.println(env.getProperty("app.env1"));
        System.out.println(env.getProperty("app.env2"));

        System.out.println(env.getProperty("app.env10")); // return null if env variable does not exist in Spring framework
//        System.out.println(env.getRequiredProperty("app.env10")); // throw an exception if env variable does not exist in Spring framework
    }
}
