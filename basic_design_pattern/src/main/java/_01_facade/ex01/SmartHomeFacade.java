package _01_facade.ex01;

public class SmartHomeFacade {

    private final Thermostat thermostat;
    private final Lights lights;
    private final CoffeeMaker coffeeMaker;

    public SmartHomeFacade(CoffeeMaker coffeeMaker, Lights lights, Thermostat thermostat) {
        this.coffeeMaker = coffeeMaker;
        this.lights = lights;
        this.thermostat = thermostat;
    }

    public void wakeUp() {
        System.out.println("wakeUp..");
        thermostat.setTemperature(22);
        lights.on();
        coffeeMaker.brewCoffee();
    }

    public void leaveHome() {
        System.out.println("leaveHome..");
        thermostat.setTemperature(10);
        lights.off();
    }
}
