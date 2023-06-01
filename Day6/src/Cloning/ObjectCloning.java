package Cloning;

import java.util.Arrays;

public class ObjectCloning implements Cloneable{
    int age;String name;
    int[] arr;
    ObjectCloning(int age,String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6};
    }

    @Override
   public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
       return super.clone();
    }

}

class Direct  {
    public static void main(String[] args) throws CloneNotSupportedException  {
        ObjectCloning obj = new ObjectCloning(12,"dogeshkumar");
        ObjectCloning obj2 = (ObjectCloning)obj.clone();
        System.out.println(obj2.age);
        obj2.age =43;
        System.out.println(obj.age);
        obj.age = 1;
        System.out.println(obj.age);
        System.out.println(Arrays.toString(obj.arr));
        obj.arr[0] = 12;

    }
}
