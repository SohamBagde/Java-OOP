package LambdaExpression;
@FunctionalInterface
interface Drawable {

    public void draw();
}

public class Without {
    public static void main(String[] args) {
        int width = 10;
        Drawable d = new Drawable() {

            @Override
            public void draw() {
                System.out.println("drawing " +width);
            }

        };
        d.draw();
    }
}
