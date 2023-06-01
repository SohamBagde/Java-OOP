package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 0;
        try{
            int result = n1/n2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("we caught an error");
        }
    }
}
