package Demo01_Thread;

public class Test {
    public static void main(String[] args) {
        MyThread1 ticket = new MyThread1();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.start();
        t2.start();
        t3.start();

    }

}
