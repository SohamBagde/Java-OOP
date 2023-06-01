package LambdaExpression;

 interface Sayable {
    public String message();

}

public class Lambda2 {
    public static void main(String[] args) {
        Sayable s1 = () -> {
            return "hello world";
        };
        System.out.println(s1.message());
    }
}
