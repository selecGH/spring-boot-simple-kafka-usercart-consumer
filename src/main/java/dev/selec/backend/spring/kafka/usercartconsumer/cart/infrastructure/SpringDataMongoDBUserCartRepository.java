package dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpringDataMongoDBUserCartRepository extends MongoRepository<UserCart, Long> {
}
