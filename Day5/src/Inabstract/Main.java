package Inabstract;

public class Main {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        Football football = new Football();

        Cricket.hello();
        cricket.bestPlayer();
        football.name();
    }
}
