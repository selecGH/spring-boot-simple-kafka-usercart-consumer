package dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.UserCartRepository;
import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;
import org.springframework.stereotype.Component;

@Component
public class UserCartMongoDBRepository implements UserCartRepository {

    private final SpringDataMongoDBUserCartRepository repository;

    public UserCartMongoDBRepository(SpringDataMongoDBUserCartRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(UserCart userCart) {
        repository.save(userCart);
    }

}
