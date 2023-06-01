package ProtectedSame;
// available within subclass of different package2
public class A {
    protected int num;
   public String name;
    int[] arr;

  public A(int num,String name) {
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }
}
