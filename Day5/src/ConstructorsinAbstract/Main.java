package ConstructorsinAbstract;

public class Main {
    public static void main(String[] args) {
        Daughter daughter = new Daughter(12);
        Son son = new Son(23);
        System.out.println(daughter.age);
        System.out.println(son.age);

        daughter.Career();
        Daughter.messiStatic();
        daughter.suarezFinal();
    }
}
