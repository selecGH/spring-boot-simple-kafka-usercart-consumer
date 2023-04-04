package dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document
public class UserProduct {

    Product product;
    Integer quantity;

}
