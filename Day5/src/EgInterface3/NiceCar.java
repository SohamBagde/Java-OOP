package EgInterface3;

public class NiceCar implements Brake{
    private Engine engine;
   private Media player = new CDplayer();
    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public NiceCar() {
        engine = new PowerEngine();
    }
    public void start() {
        engine.start();
    }
    public void stop() {
        engine.stop();
    }
    public void startMusic() {
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
    @Override
    public void brake() {
        System.out.println("brake");
    }

}
