package EgInterface3;

public class CDplayer implements Media {
    @Override
   public void start() {
        System.out.println("media started");
    }

    @Override
    public void stop() {
        System.out.println("media stopped");
    }
}
