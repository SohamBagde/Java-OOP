package Enums;

public class EnumsinSwitch {
    public static void main(String[] args) {
       Ratio r = Ratio.COMMONL;
        switch (r) {
            case COMMONL -> {System.out.println("its one");}
            case RATIO -> {System.out.println("its 2");}
            case COUNTER -> {System.out.println("its 3");}
            default -> {System.out.println("not valid");}
        }

// looping through enums
        for(Ratio r1 : Ratio.values()) {
            System.out.println(r1);
        }
    }
}
