package MultiLevelInheritance;

public class BoxPrice extends BoxWeight{
    int price;
    BoxPrice() {
        super();
        this.price = -1;
    }
    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    BoxPrice(int h,int l,int w,int weight,int price) {
        super(l,h,w,weight);
        this.price = price;
    }
    BoxPrice(int side,int weight,int price) {
        super(side,weight);
        this.price = price;

    }
}
