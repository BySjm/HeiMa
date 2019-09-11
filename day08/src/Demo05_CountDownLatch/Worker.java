package Demo05_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{

    private CountDownLatch latch;

    public Worker(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("A");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}
