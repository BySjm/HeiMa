package HomeWork.T1;

public class Seller implements Runnable {

    private int count = 100;

    @Override
    public void run() {

        int sellCount = 0;

        while (true){
            synchronized (this){
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (count > 0){
                    count--;
                    sellCount++;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + sellCount + "张票,剩余" + count);
                }else {
                    break;
                }
            }
        }
    }
}
