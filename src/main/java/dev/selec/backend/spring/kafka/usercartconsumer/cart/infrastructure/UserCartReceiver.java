package dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;

public interface UserCartReceiver {

    // TODO: Refactor this input class to make a bit more generic and well designed,
    //  to be able to work with a controller if needed
    void receive(UserCart userCart);

}
