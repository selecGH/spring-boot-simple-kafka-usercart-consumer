package dev.selec.backend.spring.kafka.usercartconsumer.shared.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConsumerConfig {

//    private final KafkaClusterConfig kafkaClusterConfig;
//
//    public KafkaConsumerConfig(KafkaClusterConfig kafkaClusterConfig) {
//        this.kafkaClusterConfig = kafkaClusterConfig;
//    }
//
//    public Map<String, Object> kafkaProps() {
//        Map<String, Object> props = new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaClusterConfig.getBootstrapServers());
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, UserCartDeserializer.class);
//        return props;
//    }
//
//    @Bean
//    public ConsumerFactory<String, UserCart> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(kafkaProps());
//    }
//
//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, UserCart>>
//    kafkaListenerContainerFactory(ConsumerFactory<String, UserCart> consumerFactory) {
//        ConcurrentKafkaListenerContainerFactory<String, UserCart> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory);
//        return factory;
//    }

}
