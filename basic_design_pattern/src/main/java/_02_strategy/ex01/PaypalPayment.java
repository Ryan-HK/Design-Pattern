package _02_strategy.ex01;

public class PaypalPayment implements PaymentStrategy {

    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal amount = " + amount);
    }
}
