package Inheritance;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(1,2,3);
        Box box3 = new Box(23);
        Box box4 = new Box(box2);
        BoxWeight box5 = new BoxWeight();

        Box box6 = new BoxWeight(1,2,3,44);
        Box box7 = new BoxWeight();

    System.out.println(box6.h);
        System.out.println(box7.l);
       /* System.out.println(box1.l);
        System.out.println(box2.h);
        System.out.println(box3.l);
        System.out.println(box4.h); */

        //System.out.println(box5.weight);
        //System.out.println(box5.w);


    }
}
