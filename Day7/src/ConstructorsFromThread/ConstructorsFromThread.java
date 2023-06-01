package ConstructorsFromThread;

class yourThread extends Thread{
    public yourThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println("hello");
    }

}

public class ConstructorsFromThread {
    public static void main(String[] args) {
        yourThread t1= new yourThread("okpal");
        yourThread t2= new yourThread("dogesh");
        yourThread t3= new yourThread("kumar");
        yourThread t4= new yourThread("joginder");
        yourThread t5= new yourThread("dusan");
        yourThread t6= new yourThread("kevinr");
        System.out.println(t1.getState());
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        t5.setPriority(Thread.MAX_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);


    }
}
