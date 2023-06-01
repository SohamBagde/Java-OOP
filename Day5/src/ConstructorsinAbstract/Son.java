package ConstructorsinAbstract;

public class Son extends Parent{
    Son(int age) {
        super(age);
    }
    @Override
    void Career() {
        System.out.println("DOCTOR");
    }

    @Override
    void relation() {
        System.out.println("i am son");
    }
}
