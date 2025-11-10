package com.paymentgateway.model;
import java.util.UUID;
public class PaymentResponse {
    public enum Status {
        SUCCESS, FAILED, PENDING
    }

    private String transactionId;
    private Status status;
    private String message;

    public PaymentResponse(Status status, String message) {
        this.transactionId = UUID.randomUUID().toString();
        this.status = status;
        this.message = message;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Status getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" +
                "transactionId='" + transactionId + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
