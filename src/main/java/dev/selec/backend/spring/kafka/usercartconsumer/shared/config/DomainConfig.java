package dev.selec.backend.spring.kafka.usercartconsumer.shared.config;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.UserCartRepository;
import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.UserCartSaver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    // Domain beans instantiation in a config class outside of domain to keep domain business logic isolated

    @Bean
    public UserCartSaver userCartSaver(UserCartRepository repository) {
        return new UserCartSaver(repository);
    }

}
