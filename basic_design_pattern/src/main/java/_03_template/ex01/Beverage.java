package _03_template.ex01;

abstract public class Beverage {

    //Template method
    final void prepareRecipe() {
        boilwater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilwater() {
        System.out.println("Beverage.boilwater");
    }

    private void pourInCup() {
        System.out.println("Beverage.pourInCup");
    }

    abstract void brew();
    abstract void addCondiments();

}
