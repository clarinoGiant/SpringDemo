import com.test.pojo.BeanConfig;
import com.test.pojo.Pet;
import com.test.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        User user = context.getBean("user", User.class);
        user.print();

        Pet pet = context.getBean("pet", Pet.class);
        pet.print();
    }
}
