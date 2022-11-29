package com.konopackipio1.warehouseapp;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProductListener {

    @KafkaListener(topics = {"products"}, groupId = "products-group")
    public void listener(ConsumerRecord<String, String> consumerRecord) {
        log.info("Product with qrCode {} received", consumerRecord.value());
        
    }
    
}
