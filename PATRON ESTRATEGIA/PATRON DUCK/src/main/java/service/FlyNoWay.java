package service;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }

    public FlyNoWay() {
    }

    @Override
    public String toString() {
        return "FlyNoWay{}";
    }

}
