package service;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am squeak");
    }

    public Squeak() {
    }

    @Override
    public String toString() {
        return "Squeak{}";
    }

}
