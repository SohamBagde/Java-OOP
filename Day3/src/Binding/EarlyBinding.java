package Binding;

public class EarlyBinding {
    static class Superclass {

         void print() {
            System.out.println("its superclass");
        }
    }
    static class Subclass extends Superclass {
        @Override
         void print() {
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

