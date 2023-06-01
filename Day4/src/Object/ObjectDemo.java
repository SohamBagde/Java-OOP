package Object;

public class ObjectDemo {
    int number;
  public ObjectDemo(int num) {
    this.number = num;
}
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
    ObjectDemo objectDemo1 = new ObjectDemo(12);
    ObjectDemo objectDemo2 = new ObjectDemo(12);

        System.out.println(objectDemo1.hashCode());
        System.out.println(objectDemo2.hashCode());
        System.out.println(objectDemo1.equals(objectDemo2));
        System.out.println(objectDemo1.getClass());

    }
}
