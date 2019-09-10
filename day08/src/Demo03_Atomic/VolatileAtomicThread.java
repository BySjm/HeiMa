package Demo03_Atomic;

public class VolatileAtomicThread implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (this){
                count++;
                System.out.println("count============>" + count);
            }
        }
    }
}
