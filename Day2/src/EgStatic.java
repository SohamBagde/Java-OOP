public class EgStatic {
  static class Dogesh {
      static String name;
        Dogesh(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Dogesh a = new Dogesh("dogesh khan");
        Dogesh b = new Dogesh("bablu");
        System.out.println(a.name);
        System.out.println(b.name);

    }

}
