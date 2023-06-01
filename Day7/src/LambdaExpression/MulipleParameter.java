package LambdaExpression;

public class MulipleParameter {
    public static void main(String[] args) {
        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation subtract = (a,b) -> a-b;
        MulipleParameter cal = new MulipleParameter();
        System.out.println(cal.operate(1,2,sum));

        // can also do
        System.out.println(sum.Operation(10,20));



    }
    private int operate(int a,int b,Operation op) {
        return op.Operation(a,b);
    }
}
