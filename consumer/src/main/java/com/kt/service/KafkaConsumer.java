package com.kt.service;

import com.kt.dto.response.ConsumerExampleResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-message", groupId = "consumer-group")
    public void consumeMessage(@Payload ConsumerExampleResponse message) {
        log.info("Consumed message: {}", message);
    }
}