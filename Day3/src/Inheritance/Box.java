package Inheritance;

public class Box {
    int l;
    int h;
    int w;
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(int l,int h,int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(int side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }
    public void information() {
        System.out.println("box is running");
    }

}
