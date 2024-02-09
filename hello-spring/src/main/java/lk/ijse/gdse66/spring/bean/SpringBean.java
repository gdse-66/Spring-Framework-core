package lk.ijse.gdse66.spring.bean;

import org.springframework.stereotype.Component;

@Component
//@Component(value = "sb")
//@Component("sb")
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean instance is created");
    }

    public void myMethod(){
        System.out.println("myMethod is invoked");
    }
}
