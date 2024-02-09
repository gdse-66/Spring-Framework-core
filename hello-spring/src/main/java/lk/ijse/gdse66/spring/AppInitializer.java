package lk.ijse.gdse66.spring;

import com.edu.ijse.JavaBean;
import com.edu.ijse.SpringBeanFour;
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
        /*boolean isExistJavaBeanDefinition =
                ctx.containsBeanDefinition("getJavaBean");
        System.out.println(isExistJavaBeanDefinition);

        boolean isExistSpringBeanFourDefinition =
                ctx.containsBeanDefinition("springBeanFour");
        System.out.println(isExistSpringBeanFourDefinition);

        boolean isExistSpringBeanDefinition =
                ctx.containsBeanDefinition("springBean");
        System.out.println(isExistSpringBeanDefinition);*/

        /*JavaBean javaBean = (JavaBean) ctx.getBean("javaBean");
        System.out.println(javaBean);*/

        /*SpringBeanFour bean1 = ctx.getBean(SpringBeanFour.class);
        System.out.println(bean1);
        SpringBeanFour bean2 = ctx.getBean(SpringBeanFour.class);
        System.out.println(bean2);
        SpringBeanFour bean3 = ctx.getBean(SpringBeanFour.class);
        System.out.println(bean3);

        System.out.println("-----------------------------");

        JavaBean javaBean1 = ctx.getBean(JavaBean.class);
        System.out.println(javaBean1);
        JavaBean javaBean2 = ctx.getBean(JavaBean.class);
        System.out.println(javaBean2);
        JavaBean javaBean3 = ctx.getBean(JavaBean.class);
        System.out.println(javaBean3);*/

        boolean isExist = ctx.containsBeanDefinition("javaBean");
        System.out.println(isExist);

        boolean isExist2 = ctx.containsBeanDefinition("springBeanFour");
        System.out.println(isExist2);
    }
}


