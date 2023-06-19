package com.jairfreitas.strproducer.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class StrtingProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Send message {}", message);
        kafkaTemplate.send("str-topic01", message);
//                .addCallback(
//                success -> {
//                    if (success != null){
//                        log.info("Mensagem enviada com sucesso {}", message);
//                        log.info("Partição {}, Offset {}",
//                                success.getRecordMetadata().partition(),
//                                success.getRecordMetadata().offset());
//                    }
//                },
//                error -> log.error("Erro ao enviar a messagem")
//        );
    }
}
