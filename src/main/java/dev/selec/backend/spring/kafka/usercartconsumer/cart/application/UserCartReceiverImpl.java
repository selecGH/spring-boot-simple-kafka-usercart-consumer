package dev.selec.backend.spring.kafka.usercartconsumer.cart.application;

import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.UserCartSaver;
import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;
import dev.selec.backend.spring.kafka.usercartconsumer.cart.infrastructure.UserCartReceiver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCartReceiverImpl implements UserCartReceiver {

    private final UserCartSaver userCartSaver;

    @Override
    public void receive(UserCart userCart) {
        userCartSaver.saveReceivedUser(userCart);
    }

}
