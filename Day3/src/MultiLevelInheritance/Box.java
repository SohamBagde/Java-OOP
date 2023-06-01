package MultiLevelInheritance;

public class Box {
    int h;
    int l;
    int w;
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(int side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(int h,int l,int w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    Box(Box other) {
        this.l= l;
        this.h = h;
        this.w = w;
    }
    public void info() {
        System.out.println("box is running");
    }
}
