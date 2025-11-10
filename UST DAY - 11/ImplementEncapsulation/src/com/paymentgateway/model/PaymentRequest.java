package com.paymentgateway.model;
import java.util.Map;
public class PaymentRequest {
    private double amount;
    private String currency;
    private PaymentMethodType paymentMethodType;
    private Map<String, String> paymentMethodDetails;

    public PaymentRequest(double amount, String currency,
                          PaymentMethodType paymentMethodType,
                          Map<String, String> paymentMethodDetails) {
        this.amount = amount;
        this.currency = currency;
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDetails = paymentMethodDetails;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public Map<String, String> getPaymentMethodDetails() {
        return paymentMethodDetails;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", paymentMethodType=" + paymentMethodType +
                ", paymentMethodDetails=" + paymentMethodDetails +
                '}';
    }
}
