package dev.selec.backend.spring.kafka.usercartconsumer.shared.exception;

public class UserCartConsumerException extends RuntimeException {

    public UserCartConsumerException(String message) {
        super(message);
    }

    public UserCartConsumerException(String message, Throwable cause) {
        super(message, cause);
    }

}
