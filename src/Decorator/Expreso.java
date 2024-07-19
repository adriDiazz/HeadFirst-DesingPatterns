package Decorator;

public class Expreso extends Beverage {

    public Expreso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
