package Demo05_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Driver {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        Worker w1 = new Worker(latch);
        Worker2 w2 = new Worker2(latch);

        Thread t2 = new Thread(w2);
        t2.start();
        Thread t1 = new Thread(w1);
        t1.start();


    }
}
