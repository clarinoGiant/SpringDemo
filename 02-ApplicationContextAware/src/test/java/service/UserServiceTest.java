package service;

import com.test.service.AddressService;
import com.test.service.UserService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest extends TestCase {

    public void testInit() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.print();

        // 获取原型定义的bean
        System.out.println(userService.getAddressService());
        System.out.println(userService.getAddressService());

        ApplicationContext applicationContext1 = userService.getApplicationContext();
        Object addressService = applicationContext1.getBean("addressService");
        System.out.println(addressService);
    }
}