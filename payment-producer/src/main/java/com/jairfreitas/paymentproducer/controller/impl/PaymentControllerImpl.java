package com.jairfreitas.paymentproducer.controller.impl;

import com.jairfreitas.paymentproducer.controller.PaymentController;
import com.jairfreitas.paymentproducer.model.Payment;
import com.jairfreitas.paymentproducer.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payments")
public class PaymentControllerImpl implements PaymentController {

    @Autowired
    private PaymentService paymentService;
    
    @Override
    public ResponseEntity<Payment> payment(Payment payment) throws InterruptedException {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
