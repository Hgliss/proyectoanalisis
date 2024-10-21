package service;

public class MallarDuck extends Duck{

    public MallarDuck() {
            fb = new FlyWithWings();
            sb = new Quack();
    }

    @Override
    public String toString() {
        return "MallarDuck{}";
    }

    @Override
    public void display(){
        System.out.println("Hi I am a Mallar Duck");

    }

}
