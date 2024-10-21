package estrategia;


public abstract class Duck {

    public void swim(){
        System.out.println("The duck is swimming");
    }
    public void fly(){
        System.out.println("The duck is flying");
    }
    public void quack(){
        System.out.println("The duck is quacking");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }

    public Duck() {
    }
    public abstract void display();

}
