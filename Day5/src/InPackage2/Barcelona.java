package InPackage2;
// we can have final method in abstract class but method should have a body int the same class

public abstract class Barcelona {
    abstract void bestPlayer();
    abstract void ucl();
    final void messi() {
        System.out.println("the GOAT");
    };

    static void suarez() {
        System.out.println("GUNMAN");
    }
}
