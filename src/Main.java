import Observer.CurrentConditionsDisplay;
import Observer.WeatherData;
import Strategy.Duck;
import Strategy.FlyingRocket;
import Strategy.MallardDuck;
import Strategy.ModelDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Duck duck = new MallardDuck();
//
//        duck.performFly();
//        duck.performQuack();
//
//        Duck model = new ModelDuck();
//
//        model.performFly();
//        model.setFlyBehavior(new FlyingRocket());
//        model.performFly();

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 30, 2);
        weatherData.setMeasurements(20, 50, 22);
    }
}