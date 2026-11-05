package kh.edu.istad.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.math.BigDecimal;

@Configuration
public class BeanConfiguration {

    @Primary
    @Bean
    public Coffee hotLatte() {
        return new Coffee("Hot Latte", BigDecimal.valueOf(4000));
    }

    @Bean
    public Coffee iceLatte() {
        return new Coffee("Ice Latte", BigDecimal.valueOf(5000));
    }

}
