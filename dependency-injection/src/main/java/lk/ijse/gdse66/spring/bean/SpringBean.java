package lk.ijse.gdse66.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SpringBean {

    public SpringBean(@Qualifier("note") String[] nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(Arrays.toString(nameList));
    }

    /*public SpringBean(List<String> nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(nameList);
    }*/

    /*public SpringBean(Collection<String> nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(nameList);
    }*/

    /*public SpringBean(Set<String> nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(nameList);
    }*/

    /*public SpringBean(Map<String,String> nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(nameList);
    }*/

    /*public SpringBean(List<GoodGirl> goodGirls) {
        System.out.println("SpringBean() - constructor - " + goodGirls);
        System.out.println(goodGirls);
    }*/
}
