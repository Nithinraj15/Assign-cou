package Abstraction;

abstract class PaymentProcessor {
    abstract boolean processPayment(double amount);
    
    public void displayProcessorType() {
        System.out.println("This is a generic payment processor.");
    }
}

class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing $" + amount + " via Credit Card.");
        return true;
    }

    @Override
    public void displayProcessorType() {
        System.out.println("This is a Credit Card payment processor.");
    }
}

class PayPalPaymentProcessor extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing $" + amount + " via PayPal.");
        return true;
    }

    @Override
    public void displayProcessorType() {
        System.out.println("This is a PayPal payment processor.");
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor cpp = new CreditCardPaymentProcessor();
        boolean res = cpp.processPayment(100.50);
        System.out.println("Credit Card Payment Successful: " + res);
        cpp.displayProcessorType();

        System.out.println();

        PaymentProcessor ppp = new PayPalPaymentProcessor();
        boolean res1 = ppp.processPayment(25.00);
        System.out.println("PayPal Payment Successful: " + res1);
        ppp.displayProcessorType();
    }
}
