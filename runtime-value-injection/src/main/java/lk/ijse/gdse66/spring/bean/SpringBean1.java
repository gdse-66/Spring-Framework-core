package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component
public class SpringBean1 {
    @Value("Amal")
    private String name;

    public SpringBean1(@Value("IJSE") String myString,
                       @Value("6") int myInt,
                       @Value("9.8") double myDouble,
                       @Value("true") boolean myBoolean,
                       @Value("1,2,3,4,5") int[] myIntArray) {
//        System.out.println("SpringBean1() - Constructor:" + myString);
//        System.out.println("name: " +name);
        System.out.println("myString: " + myString);
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
    }

    @PostConstruct
    public void initialize(){
        System.out.println("name: " +name);
    }
}
