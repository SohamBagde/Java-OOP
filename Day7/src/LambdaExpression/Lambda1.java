package LambdaExpression;
@FunctionalInterface
interface Drawing {
    public void udraw();
}

public class Lambda1 {
    public static void main(String[] args) {
        int width = 10;
        Drawing d1 = () -> {
            System.out.println("drawing " + width);
        };
        d1.udraw();
    }
}
