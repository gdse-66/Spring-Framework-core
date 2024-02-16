package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Boy boy1 = ctx.getBean(Boy.class);
        System.out.println(boy1);

        System.out.println("--------------------------");
        Boy boy2 = ctx.getBean(Boy.class);
        System.out.println(boy2);
    }
}
