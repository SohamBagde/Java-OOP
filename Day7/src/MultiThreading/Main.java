package MultiThreading;
class MyThread1 extends Thread {
    public void hello() {
        int i=0;
        while(i<10) {
            System.out.println("hello");
            i++;
        }
    }
    @Override
    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("first");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
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
        MyThread1 one = new MyThread1();
        MyThread2 second = new MyThread2();

       // one.hello();
        one.start();
        second.start();


    }
}
