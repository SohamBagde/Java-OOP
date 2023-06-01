package ProtectedSame;
// available within subclass of same package
public class Ratio extends A {
    public Ratio(int num,String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        Ratio ratio = new Ratio(12,"dogeshkumar");
        System.out.println(ratio.name);
        System.out.println(ratio.num);

    }

}
