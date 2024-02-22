package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        System.out.println("=================================");
        /* Let's access OS env variables in our java program */
        Map<String, String> map = System.getenv();
//        System.out.println(map);
        /*for (String keys: map.keySet()) {
            System.out.println(keys + "="+ map.get(keys));
        }*/

        System.out.println("=================================");

        /* Let's access JRE env variables in our java program*/
        Properties envVariables = System.getProperties();
//        System.out.println(envVariables);
//        envVariables.put("city","Galle");
        /*for (Object key : envVariables.keySet()) {
            System.out.println(key + "= " + System.getProperty(key.toString()));
        }*/

    }
}
