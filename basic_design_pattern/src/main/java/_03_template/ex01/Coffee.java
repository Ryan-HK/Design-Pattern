package _03_template.ex01;

public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }

}
