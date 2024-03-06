package main;

//Service Class
public class PaymentService {
 private PaymentGateway paymentGateway;

 public PaymentService(PaymentGateway paymentGateway) {
     this.paymentGateway = paymentGateway;
 }

 public boolean processPayment(double amount) throws PaymentFailedException {
     try {
         return paymentGateway.makePayment(amount);
     } catch (PaymentGatewayException e) {
         throw new PaymentFailedException("Payment failed", e);
     }
 }
}
