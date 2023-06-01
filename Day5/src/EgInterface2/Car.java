package EgInterface2;

public class Car implements Engine,Brake,Media{
    @Override
    public void start() {
        System.out.println("lets start");
    }

    @Override
    public void stop() {
        System.out.println("stop it");
    }

    @Override
    public void brake() {
        System.out.println("apply the brake");
    }

    @Override
    public void acc() {
        System.out.println("accelerate it");
    }

}
