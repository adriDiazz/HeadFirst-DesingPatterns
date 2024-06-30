package Strategy;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Im a mallard Strategy.Duck");
    }
}
