public class EgSingleton {
    public static void main(String[] args) {
        EgSingleton obj = EgSingleton.getInstance();
    }
    private EgSingleton() {};
    private static EgSingleton instance = null;

    public static EgSingleton getInstance() {
        if(instance == null) {
            instance = new EgSingleton();
            System.out.println("done");
        }
        else {
            System.out.println("did nothing");
        }
        return instance;
    }

}
