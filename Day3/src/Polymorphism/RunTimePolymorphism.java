package Polymorphism;

class Base {
    void print() {
        System.out.println("IN BASE CLASS");
    }
}

class Child1 extends Base {
    @Override // TO CHECK WHETHER IT IS OVERRIDING
    void print() {
        System.out.println("in FIRST child class");
    }
}

class  Child2 extends Base {
    @Override
    void print() {
        System.out.println("in Second child class");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Base b = new Base();
        b.print();

         b = new Child1(); // Base b1 = new Child();
        b.print();         // b1.print();

        b = new Child2();
        b.print();
    }
}
