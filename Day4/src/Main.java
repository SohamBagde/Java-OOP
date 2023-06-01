 class Human {
    private int num;
    String name;
    int[] arr;
    public int getNum() {
        return num;
    }
    public void setNum(int n) {
        num = n;
    }
    Human(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr  = new int[num];
    }
}
public class Main {
    public static void main(String[] args) {
        Human human = new Human(10,"dogesh");
        System.out.println(human.name);
        System.out.println(human.getNum());
    }
}