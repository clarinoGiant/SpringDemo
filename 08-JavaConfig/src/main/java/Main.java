import config.UserConfig;
import model.Book;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getAddress());

        Book book = context.getBean("getBook", Book.class);
        System.out.println(book.getName());
    }
}
