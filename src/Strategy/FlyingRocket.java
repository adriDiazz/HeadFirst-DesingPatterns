package Strategy;

public class FlyingRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Im flying with a rocket");
    }
}
