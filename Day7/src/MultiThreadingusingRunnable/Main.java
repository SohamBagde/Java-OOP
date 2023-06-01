package MultiThreadingusingRunnable;
class OurThread1 implements Runnable {

    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("FIRST");
            i++;
        }
    }
}

class OurThread2 implements Runnable {

    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("second pal");
            i++;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Thread second2 = new Thread(new OurThread2());
        Thread first1 = new Thread(new OurThread1());
        first1.start();
        second2.start();
    }
}
