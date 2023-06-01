package ExceptionHandling;

public class MultipleException {
    public static void main(String[] args) {
       try {
           int c = AE.divide(12444444,1);
           System.out.println(c);
       } catch (ArithmeticException e) {
           System.out.println(e.getMessage());
       } catch (Exception e) {
           System.out.println("normal exception");
       }
       finally {
           System.out.println("program ends");
       }
    }
}
