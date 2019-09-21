package HomeWork.T3;

public class SuiDao implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        throwS();
    }

    private synchronized void throwS(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println( Thread.currentThread().getName() + "是第" + count + "通过了隧道");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
