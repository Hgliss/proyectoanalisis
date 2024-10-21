package service;

public class ModelDuck extends Duck {
    public ModelDuck() {
        fb = new FlyNoWay();
        sb = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }

}
