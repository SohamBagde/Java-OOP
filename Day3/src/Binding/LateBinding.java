package Binding;
// OVER LOADING
public class LateBinding {
    static class Superclass {
        static void print() {
            System.out.println("its superclass");
        }
    }
    static class Subclass extends Superclass {
        static void print() {
            System.out.println("its subclass");
        }
    }
    public static void main(String[] args) {
        Superclass A = new Superclass();
        Subclass B = new Subclass();
            A.print();
            B.print();
    }
}
