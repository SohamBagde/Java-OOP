package Polymorphism;
// method overloading
public class CompileTimePoly {
    int sum(int a,int b) {
        return a+b;
    }

    int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        CompileTimePoly compileTimePoly = new CompileTimePoly();
       int d =  compileTimePoly.sum(1,2);
        System.out.println(d);

        compileTimePoly.sum(1,2,3);
    }
}
