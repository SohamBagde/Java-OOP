package Cloning;

import java.util.Arrays;

public class DeepCopying implements Cloneable{
    int age;
    String name;
    int[] arr;
    public DeepCopying(int age,String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4};
    }
    public Object Clone() throws CloneNotSupportedException {
        DeepCopying twin = (DeepCopying)super.clone();
        twin.arr = new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

class Lo1l {
    public static void main(String[] args) throws CloneNotSupportedException{
        DeepCopying object1 = new DeepCopying(1,"dogesh");
        DeepCopying twin = (DeepCopying)object1.Clone();
        System.out.println(Arrays.toString(object1.arr));
        twin.arr[0] = 23;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(object1.arr));


    }
}
