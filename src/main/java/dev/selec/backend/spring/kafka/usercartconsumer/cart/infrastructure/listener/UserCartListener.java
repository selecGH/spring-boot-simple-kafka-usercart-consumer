package dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure.listener;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure.UserCartReceiver;
import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserCartListener {

    private final UserCartReceiver receiver;

    public UserCartListener(UserCartReceiver receiver) {
        this.receiver = receiver;
    }

    @KafkaListener(topics = "user-carts", groupId = "1")
    public void getUserCart(UserCart userCart) {
        log.info("UserCart listened with id: " + userCart.getUserId());
        receiver.receive(userCart);
    }

}
