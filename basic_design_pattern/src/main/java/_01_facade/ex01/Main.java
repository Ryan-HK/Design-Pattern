package _01_facade.ex01;

public class Main {


    /**
     * Facade Pattern
     * -. 여러 기능으로 이루어진 서브시스템을 하나의 Facade 클래스에서 사용할 수 있는 패턴이다.
     */
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(coffeeMaker, lights, thermostat);

        smartHomeFacade.wakeUp();
        smartHomeFacade.leaveHome();

    }
}