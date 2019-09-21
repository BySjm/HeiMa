package HomeWork.T3;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("我需要一个老师");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ",电话123");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教我java,教完后，老师回到了办公室");
    }
}
