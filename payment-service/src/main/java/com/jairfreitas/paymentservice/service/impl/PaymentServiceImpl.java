package com.jairfreitas.paymentservice.service.impl;

import com.jairfreitas.paymentservice.model.Payment;
import com.jairfreitas.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    @Override
    public void sendPayment(Payment payment) throws InterruptedException {
        log.info("Recebi o pagamento {}", payment);
        Thread.sleep(1000);
        log.info("Enviando pagamento...");
        kafkaTemplate.send("payment-topic", payment);
    }
}
