package ConstructorsinAbstract;
// u can use constuctors in abstract class

public abstract class Parent {
    int age;
    Parent(int age) { // u have to compulsory use this in every child class
        this.age = age;
    }
    void hello() {
        System.out.println("In parent class");
    }
    abstract void Career();
    abstract void relation();

    static void messiStatic() {
        System.out.println("hello leo");
    }
    final void suarezFinal() {
        System.out.println("hello suarez");
    }
    }
