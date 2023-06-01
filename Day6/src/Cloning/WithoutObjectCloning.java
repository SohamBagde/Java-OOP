package Cloning;

public class WithoutObjectCloning {
    int age;
    String name;
    WithoutObjectCloning(int age,String name) {
        this.age = age;
        this.name = name;
    }
    WithoutObjectCloning(WithoutObjectCloning other) {
        this.age = other.age;
        this.name = other.name;
    }
}

class Lol {
    // but this is not efficient as it uses new even for cloning
    public static void main(String[] args) {
        WithoutObjectCloning withoutObjectCloning = new WithoutObjectCloning(23,"dogeshsingh");
        WithoutObjectCloning withoutObjectCloning1 = new WithoutObjectCloning(withoutObjectCloning);
        System.out.println(withoutObjectCloning1.age);
    }
}
