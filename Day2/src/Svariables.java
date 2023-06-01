public class Svariables {
    static int a=4;
    static int b;

    static   { // only runs once no matter how many times u call it
        System.out.println(" i am static block");
        b=a*5;
    }

    public static void main(String[] args) {
        Svariables obj = new Svariables();
        System.out.println(obj.a + " " + Svariables.b);

        Svariables.b +=3;
        System.out.println(obj.a + " " + Svariables.b);

        Svariables obj2 = new Svariables();
        System.out.println(obj.a + " " + Svariables.b);
    }
}
