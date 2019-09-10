package Demo03_Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileAtomicThreader02 implements Runnable {

    //private int count = 0;
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.getAndIncrement();
            System.out.println("count============>" + count);
        }
    }
}
