package Enums;

public class Enum3 {
    enum What1 {
        WINTER(1),
        SUMMER(2),
        SPRING(3),
        MONSOON(4);

        private int value;
        private What1(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        for (What1 w : What1.values()) {
            System.out.println(w + " " +w.value);
        }
    }
}
