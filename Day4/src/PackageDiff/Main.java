package PackageDiff;
// not available within whole class of different package
import ProtectedSame.A;

public class Main {
    public static void main(String[] args) {
        A obj  = new A(2,"KUMAR");
        // System.out.println(obj.num); // error
        System.out.println(obj.name);

    }
}
