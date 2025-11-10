package com.paymentgateway.processor;

import com.paymentgateway.model.PaymentRequest;
import com.paymentgateway.model.PaymentResponse;

import java.util.Map;

public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        Map<String, String> details = request.getPaymentMethodDetails();
        String cardNumber = details.get("cardNumber");

        if (request.getAmount() < 100 && cardNumber.startsWith("4")) {
            return new PaymentResponse(PaymentResponse.Status.SUCCESS,
                    "Credit card payment approved for card ending with " +
                            cardNumber.substring(cardNumber.length() - 4));
        } else {
            return new PaymentResponse(PaymentResponse.Status.FAILED,
                    "Credit card payment declined due to insufficient balance or invalid card.");
        }
    }
}
