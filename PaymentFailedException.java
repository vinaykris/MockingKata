package main;

//Custom Exception
public class PaymentFailedException extends Exception {
 public PaymentFailedException(String message, Throwable cause) {
     super(message, cause);
 }
}
