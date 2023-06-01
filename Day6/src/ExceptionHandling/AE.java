package ExceptionHandling;

public class AE {
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("CANNOT DIVIDE BY ZERO");
        }
        return a/b;
    }
    public static void main(String[] args) {
        //System.out.println(divide(12,0));
    }
}
