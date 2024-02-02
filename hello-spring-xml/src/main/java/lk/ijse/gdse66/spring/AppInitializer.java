package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        SpringBean springBean = ctx.getBean(SpringBean.class);
        System.out.println(springBean);
    }
}
