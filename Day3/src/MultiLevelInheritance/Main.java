package MultiLevelInheritance;

public class Main {
    public static void main(String[] args) {
        BoxPrice box1 = new BoxPrice(5,8,200);
        BoxPrice box2 = new BoxPrice();
        BoxPrice box3 = new BoxPrice(1,2,3,4,5);
        BoxPrice box4 = new BoxPrice(box3);

        System.out.println(box1.price);
        System.out.println(box2.h);
        System.out.println(box3.weight);
        System.out.println(box4.weight);

    }
}
