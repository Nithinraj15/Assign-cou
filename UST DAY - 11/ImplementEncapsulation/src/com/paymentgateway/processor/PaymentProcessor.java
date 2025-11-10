package com.paymentgateway.processor;

import com.paymentgateway.model.PaymentRequest;
import com.paymentgateway.model.PaymentResponse;

public interface PaymentProcessor {
    PaymentResponse processPayment(PaymentRequest request);
}

