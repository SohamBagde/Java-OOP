package EgInterface3;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("POWER engine started");
    }

    @Override
    public void stop() {
        System.out.println("POWER engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("POWER engine accelerated");
    }
}
