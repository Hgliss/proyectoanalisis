package service;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Yo soy soy un plan avanzado y tengo un costo de 200");
    }

    public Quack() {
    }

    @Override
    public String toString() {
        return "Quack{}";
    }

}
