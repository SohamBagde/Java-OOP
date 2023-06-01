package ConstructorsinAbstract;

public class Daughter extends Parent{
    Daughter(int age) {
        super(age);
    }
    @Override
    void relation() {
        System.out.println("i am daughter");
    }

    @Override
    void Career() {
        System.out.println("MBBS");
    }
}
