package Demo06_CyclicBarrier;

public class Meeting implements Runnable{
    @Override
    public void run() {
        System.out.println("人都到了，开会吧");
    }
}
