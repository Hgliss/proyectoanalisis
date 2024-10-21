package service;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        fb = new FlyNoWay();
        sb = new Squeak();
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }

    @Override
    public void display() {
        System.out.println("Hi I am a DecoyDuck");

    }



}
