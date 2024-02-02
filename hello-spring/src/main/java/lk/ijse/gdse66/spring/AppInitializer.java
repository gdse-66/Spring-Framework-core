package lk.ijse.gdse66.spring;

import lk.ijse.gdse66.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

//        AppConfig appConfig = ctx.getBean(AppConfig.class);
//        System.out.println(appConfig);

        /* access spring bean through class type */
//        SpringBean springBean = ctx.getBean(SpringBean.class);
//        System.out.println(springBean);

        /* access spring bean through bean id (default bean id) */
//        SpringBean springBean1 = (SpringBean) ctx.getBean("springBean");
//        System.out.println(springBean1);

        /* access spring bean through bean id (we can change default bean id through value attribute of @component) */
//        SpringBean sb = (SpringBean) ctx.getBean("sb");
//        System.out.println(sb);

        /* invoke run() method just before JVM shutdown */
        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shutdown");
                ctx.close();
            }
        }));*/

        ctx.registerShutdownHook();

//        ctx.close();

//        SpringBean2 springBean2 = ctx.getBean(SpringBean2.class);
//        System.out.println(springBean2);

//        System.out.println(ctx);
//        System.out.println(springBean);
//        springBean.myMethod();

//        SpringBeanThree sb3 = ctx.getBean(SpringBeanThree.class);
//        System.out.println(sb3);
    }
}


