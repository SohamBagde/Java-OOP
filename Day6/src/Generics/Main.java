package Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(23);
        list.add(23);
        System.out.println(list);
    }
}
