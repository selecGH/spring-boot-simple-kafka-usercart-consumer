package dev.selec.backend.spring.kafka.usercartconsumer.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.selec.backend.spring.kafka.usercartconsumer.shared.exception.UserCartConsumerException;
import dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities.UserCart;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UserCartDeserializer implements Deserializer<UserCart> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public UserCart deserialize(String topic, byte[] data) {
        UserCart userCart = null;
        try {
            userCart = objectMapper.readValue(data, UserCart.class);
        } catch (IOException e) {
            throw new UserCartConsumerException("Produced exception while deserializing incoming message");
        }
        return userCart;
    }

}
