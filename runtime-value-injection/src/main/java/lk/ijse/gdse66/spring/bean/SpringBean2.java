package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean2 {
    public SpringBean2(@Value("${USERNAME}") String username,
                       @Value("${HOME}") String home,
                       @Value("${os.name}") String osName,
                       @Value("${java.version}") String javaVersion,
                       @Value("${app.env1}") String env1,
                       @Value("${app.env2}") String env2,
                       @Value("${app.anv}") String env) {
        System.out.println("SpringBean2() - constructor");
        System.out.println("username: " +username);
        System.out.println("home: " + home);
        System.out.println("os name: " + osName);
        System.out.println("java version: " + javaVersion);
        System.out.println("app env1: " + env1);
        System.out.println("app env2: " + env2);
        System.out.println("app env: " + env);
    }
}
