package _03_template.ex01;

import _02_strategy.ex01.CreditCardPayment;
import _02_strategy.ex01.PaypalPayment;
import _02_strategy.ex01.ShoppingCart;

public class Main {


    /**
     * Template Pattern
     * 구현할 알고리즘의 구조는 고정되어 있되, 그 세부 과정 각각은 변경하거나 확장될 수 있는 경우에 유용하게 활용
     * 장점
     * -. 템플릿 코드를 재사용하고 중복 코드를 줄일 수 있다.
     * -. 템플릿 코드를 변경하지 않고 상속을 받아서 구체적인 알고리즘만 변경할 수 있다.
     *
     * 단점
     * -. 리스코프 치환 원칙을 위반할 수도 있다.
     * -. (템플릿은 원래 해야할 의도를 유지해야한다. 따라서 template은 final로 선언)
     * -. 알고리즘 구조가 복잡할 수록 템플릿을 유지하기 어려워진다.
     *
     * 템플릿 콜백 패턴으로도 리팩토링이 가능하다.
     * -. 템플릿 메소드에서 각 기능을 구현한 클래스를 파라미터로 받는 것 이다.
     */
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking Tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        coffee.prepareRecipe();
    }

}