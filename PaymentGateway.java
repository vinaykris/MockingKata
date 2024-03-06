package main;

//Payment Gateway Interface
public interface PaymentGateway {
 boolean makePayment(double amount) throws PaymentGatewayException;
}