package dev.selec.backend.spring.kafka.usercartconsumer;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure.SpringDataMongoDBUserCartRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = SpringDataMongoDBUserCartRepository.class)
public class UsercartConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercartConsumerApplication.class, args);
    }

}