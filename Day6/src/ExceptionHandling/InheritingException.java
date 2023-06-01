package ExceptionHandling;
class MyExceptions extends Exception {
    public MyExceptions(String message) {
        super(message);
    }
}
public class InheritingException {
    public static void main(String[] args) {
        try {
            String name = "soham";
            if (name.equals("sohamw")) {
                throw new MyExceptions("NAME IS SOHAM");
            } } catch (MyExceptions e) {
            throw new RuntimeException(e);
        } finally{
                System.out.println("this will always execute");
            }

    }
}
