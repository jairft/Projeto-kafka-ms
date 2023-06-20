package com.jairfreitas.paymentservice.controller.impl;

import com.jairfreitas.paymentservice.controller.PaymentController;
import com.jairfreitas.paymentservice.model.Payment;
import com.jairfreitas.paymentservice.service.PaymentService;
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
