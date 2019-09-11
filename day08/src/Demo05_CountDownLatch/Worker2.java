package Demo05_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Worker2 implements Runnable{

    private CountDownLatch latch;

    public Worker2(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("B");
        latch.countDown();
    }
}
