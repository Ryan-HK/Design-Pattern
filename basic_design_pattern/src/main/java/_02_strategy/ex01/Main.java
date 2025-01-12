package _02_strategy.ex01;

import _01_facade.ex01.CoffeeMaker;
import _01_facade.ex01.Lights;
import _01_facade.ex01.SmartHomeFacade;
import _01_facade.ex01.Thermostat;

public class Main {


    /**
     * Strategy Pattern
     * -. 어떤 일에 하는 모드들을 여러 전략을 만들고
     * 필요에 따라 선택해서 사용하는 패턴을 말한다.
     */
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(
                new CreditCardPayment(
                        "John Doe",
                        "010-0000-0000"
                )
        );

        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(
                new PaypalPayment(
                        "johndoe@example.com"
                )
        );

        shoppingCart.checkout(200);
    }

}