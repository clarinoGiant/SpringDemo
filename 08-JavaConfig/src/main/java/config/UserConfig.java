package config;

import model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BookConfig.class})
public class UserConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}
