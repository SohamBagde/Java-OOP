package InPackage2;

public class Main {
    public static void main(String[] args) {
      /*  Barcelona barcelona = new Barcelona();  -> u cannot make object of parent class */
        Pep pep = new Pep();
        Koeman koeman = new Koeman();

        pep.ucl();
        pep.messi();  // for final method
        Pep.suarez(); // for static method
    }
}
