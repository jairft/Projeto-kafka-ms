package com.jairfreitas.paymentservice.service;

import com.jairfreitas.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
