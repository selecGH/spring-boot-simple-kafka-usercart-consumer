package dev.selec.backend.spring.kafka.usercartconsumer.cart.domain;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;

public interface UserCartRepository {

    void save(UserCart userCart);

}
