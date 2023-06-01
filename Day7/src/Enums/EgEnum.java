package Enums;

public class EgEnum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
    }
}
