package service;

public class FlyLikeRocket implements FlyBehavior {

    @Override
    public void fly() {
            System.out.println("I fly to space");
    }

    public FlyLikeRocket() {
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }

}
