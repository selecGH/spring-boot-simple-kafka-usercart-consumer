package dev.selec.backend.spring.kafka.usercartconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserProduct {

    Product product;
    Integer quantity;

}
