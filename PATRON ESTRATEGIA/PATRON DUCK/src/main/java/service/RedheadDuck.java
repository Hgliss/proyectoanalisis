package service;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
    }

    @Override
    public String toString() {
        return "RedheadDuck{}";
    }
    public void display(){
        System.out.println("Hi I am a Redhead Duck");
    }
}
