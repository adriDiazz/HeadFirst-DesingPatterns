package Decorator;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainDecorator {
    public static void main(String[] args) {

        Beverage beverage = new Expreso();

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println(beverage.cost());
    }
}