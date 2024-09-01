package br.com.rodrigues.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfiguration {


    @Bean
    public ProducerFactory<String, String> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    private static final Logger LOG = LoggerFactory.getLogger(KafkaConfiguration.class);



    /**
     * The method was created with the principle of clean code, using only one method whenever necessary to consume a message via Kafka
     *
     * @return body, offsets from topic, topicName, partitions, and key-message
     * @apiNote kafka.topic.name (.properties) and kafka.consumer.group (.properties)
     * @implNote logging for data
     * @since by Enzo Rodrigues
     */
    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.consumer.group}")
    public String consumerMessage(ConsumerRecord<String, String> record) {
        LOG.info("Message from topic {} with value: {}", record.topic(), record.value());
        return record.toString();
    }

    /**
     * The method was created with the principle of clean code, using only one method whenever necessary to forward a message via Kafka
     *
     * @param topicName the name of the topic
     * @param message   the message to be sent
     * @implNote logging for data
     * @since by Enzo Rodrigues
     */
    public <T> void sendMessage(String topicName, T message) {
        LOG.info("Sending message to topic {} with value: {}", topicName, message.toString());
        kafkaTemplate().send(topicName, message.toString());
    }
}