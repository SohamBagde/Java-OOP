package EgInterface;

public class Car implements Brake,Engine{
    @Override
    public void start() {
        System.out.println("started the engine");
    }

    @Override
    public void stop() {
        System.out.println("stopped the engine");
    }

    @Override
    public void acc() {
        System.out.println("accelarated the engine");
    }

    @Override
    public void brake() {
        System.out.println("put on the brake");
    }
}
