package dev.selec.backend.spring.kafka.usercartconsumer.listener;

import dev.selec.backend.spring.kafka.usercartconsumer.model.UserCart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserCartListener {

    @KafkaListener(topics = "user-carts", groupId = "1")
    public void listenCartCreated(UserCart userCart) {
        log.info("Cart created with id: " + userCart.getUserId());
    }

}
