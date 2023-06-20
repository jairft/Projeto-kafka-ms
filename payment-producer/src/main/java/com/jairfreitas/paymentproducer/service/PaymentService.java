package com.jairfreitas.paymentproducer.service;

import com.jairfreitas.paymentproducer.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment) throws InterruptedException;
}
