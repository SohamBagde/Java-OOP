package PackageDiff;

import ProtectedSame.A;

public class Subclass extends A {
   public Subclass(int num,String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass subclass = new Subclass(1,"DOGESHKHAN");
        System.out.println(subclass.num);
        System.out.println(subclass.name);
    }
}

