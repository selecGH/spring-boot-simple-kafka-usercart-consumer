package dev.selec.backend.spring.kafka.usercartconsumer.config;

import dev.selec.backend.spring.kafka.usercartconsumer.deserializer.UserCartDeserializer;
import dev.selec.backend.spring.kafka.usercartconsumer.model.UserCart;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConsumerConfig {

    private final KafkaClusterConfig kafkaClusterConfig;

    public KafkaConsumerConfig(KafkaClusterConfig kafkaClusterConfig) {
        this.kafkaClusterConfig = kafkaClusterConfig;
    }

    public Map<String, Object> kafkaProps() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaClusterConfig.getBootstrapServers());
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, UserCartDeserializer.class);
        return props;
    }

    @Bean
    public ConsumerFactory<String, UserCart> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(kafkaProps());
    }

    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, UserCart>>
    kafkaListenerContainerFactory(ConsumerFactory<String, UserCart> consumerFactory) {
        ConcurrentKafkaListenerContainerFactory<String, UserCart> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);
        return factory;
    }

}
