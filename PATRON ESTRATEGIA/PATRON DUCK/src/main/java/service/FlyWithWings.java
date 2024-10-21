package service;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }

    public FlyWithWings() {
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }

}
