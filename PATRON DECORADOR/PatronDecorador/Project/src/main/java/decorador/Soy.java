package decorador;

public class Soy extends Condiment{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }
    public double cost(){
        return 0.15 + beverage.cost();
    }
}

