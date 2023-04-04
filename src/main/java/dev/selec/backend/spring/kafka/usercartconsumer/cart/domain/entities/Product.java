package dev.selec.backend.spring.kafka.usercartconsumer.cart.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = -8947004701156514167L;

    private Integer id;
    private String name;
    private String company;
    private Double price;

}
