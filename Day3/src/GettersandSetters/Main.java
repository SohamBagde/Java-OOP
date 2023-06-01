package GettersandSetters;
class Human {
    private int id;
    private String name;
    int salary;

    public String getName() {
        return name;
    }
    public void setName(String naam) {
        name = naam;
    }

    public int getId() {
        return id;
    }
    public void setId(int n) {
        id = n;
    }
}
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.salary = 23000;
        human.setId(23);
        human.setName("dogeshsingh");

        System.out.println(human.salary);
        System.out.println(human.getName());
        System.out.println(human.getId());
    }
}
