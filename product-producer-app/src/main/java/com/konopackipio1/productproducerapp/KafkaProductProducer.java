package com.konopackipio1.productproducerapp;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.konopackipio1.productproducerapp.model.OfficeDesk;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProductProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public OfficeDesk produceOfficeDesk() {
        OfficeDesk officeDesk = new OfficeDesk("OFD");
        return ProductCreator.setQrCode(officeDesk);
    }

    @Scheduled(fixedRate = 5000)
    public void sendOfficeDesk() {
        OfficeDesk officeDesk = produceOfficeDesk();
        ProducerRecord<String, String> producerRecord = new ProducerRecord<String,String>("products", officeDesk.getProductKey(), officeDesk.getQrCode());

        kafkaTemplate.send(producerRecord);
        log.info("Product with qr code {} was sent", officeDesk.getQrCode());
    }
    
}
