import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld",HelloWorld.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld",HelloWorld.class);

        Cat catbean1 = (Cat) applicationContext.getBean("cat",Cat.class);
        Cat catbean2 = (Cat) applicationContext.getBean("cat",Cat.class);
        System.out.println(bean.equals(bean1));
        System.out.println(catbean1.equals(catbean2));
    }
}