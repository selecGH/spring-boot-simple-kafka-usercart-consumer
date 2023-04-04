package dev.selec.backend.spring.kafka.usercartconsumer.cart.domain;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserCartSaver {

    private final UserCartRepository repository;

    public void saveReceivedUser(UserCart userCart) {
        repository.save(userCart);
    }

}
