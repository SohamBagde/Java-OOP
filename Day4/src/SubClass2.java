import ProtectedSame.A;

public class SubClass2 extends A {
    SubClass2(int num,String name) {
        super(num,name);
    }
    public static void main(String[] args) {
        SubClass2 subClass2 = new SubClass2(1,"SINGH");
        System.out.println(subClass2 instanceof A);
        System.out.println(subClass2 instanceof SubClass2);
        System.out.println(subClass2 instanceof Object);

    }
}
