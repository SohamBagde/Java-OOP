public class WithoutDot {
    public static void main(String[] args) {
        Hindustan a = new Hindustan("dogesh");
        Hindustan b = new Hindustan("joginder");
        System.out.println(a);
    }
}

class Hindustan {
    String name;
    Hindustan(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
