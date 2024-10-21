package service;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I cannot make sound");
    }

    public MuteQuack() {
    }

    @Override
    public String toString() {
        return "MuteQuack{}";
    }

}
