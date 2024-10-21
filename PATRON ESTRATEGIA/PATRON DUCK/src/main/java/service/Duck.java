package service;
import lombok.Setter;

@Setter
public abstract class Duck {
    protected FlyBehavior fb;
    protected QuackBehavior sb;

    public void swim(){
        System.out.println("The duck is swimming");
    }
    public void performFly(){
        fb.fly();
    }
    public void performQuack(){
        sb.quack();
    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    public Duck() {
    }
    public abstract void display();
}
