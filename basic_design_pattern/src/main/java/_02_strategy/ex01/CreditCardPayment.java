package _02_strategy.ex01;

public class CreditCardPayment implements PaymentStrategy {

    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.cardNumber = cardNumber;
        this.name = name;
    }


    @Override
    public void pay(int amount) {
        System.out.println("creditCard amount = " + amount);
    }
}
