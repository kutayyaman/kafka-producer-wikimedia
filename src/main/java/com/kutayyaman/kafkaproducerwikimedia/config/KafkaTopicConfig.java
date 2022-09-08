package com.kutayyaman.kafkaproducerwikimedia.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    private static final String WIKIMEDIA_TOPIC= "wikimedia_recent_change_topic";

    @Bean
    public NewTopic wikimediaTopic(){
        return TopicBuilder.name(this.WIKIMEDIA_TOPIC)
                .build();
    }
}
