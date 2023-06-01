package MultiLevelInheritance;

public class BoxWeight extends Box{
    int weight;
    BoxWeight() {
        super();
        this.weight = -1;
    }
    BoxWeight(int side,int weight) {
        super(side);
        this.weight = weight;
    }
    BoxWeight(int h,int l,int w,int weight) {
        super(h,l,w);
        this.weight = weight;
    }
    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

}
