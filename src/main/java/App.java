import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld helloworldbean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloworldbean.getMessage());
        Cat catBean = (Cat) applicationContext.getBean("Cat");
        Cat catBean2 = (Cat) applicationContext.getBean("Cat");
        System.out.println(bean == helloworldbean);
        System.out.println(catBean == catBean2);
    }
}