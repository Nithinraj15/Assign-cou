package com.paymentgateway.processor;
import com.paymentgateway.model.PaymentRequest;
import com.paymentgateway.model.PaymentResponse;
import java.util.Map;
public class PayPalProcessor implements PaymentProcessor {

    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        Map<String, String> details = request.getPaymentMethodDetails();
        String email = details.get("email");

        if (request.getAmount() < 200) {
            return new PaymentResponse(PaymentResponse.Status.SUCCESS,
                    "PayPal payment successful for account: " + email);
        } else {
            return new PaymentResponse(PaymentResponse.Status.FAILED,
                    "PayPal payment failed due to balance limit.");
        }
    }
}
