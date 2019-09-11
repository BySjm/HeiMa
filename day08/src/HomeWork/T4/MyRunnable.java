package HomeWork.T4;

public class MyRunnable implements Runnable {
    int count = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int num = 0;
        while (true) {
            synchronized (this) {
                if (count < 100) {
                    count++;
                    String dc = DoubleColorBallUtil.create();
                    System.out.println("编号是" + count + "的员工从" + name + "入场，拿到的编号是" + dc);
                    num++;
                } else {
                    System.out.println("从" + name + "进来的员工个数是" + num);
                    break;
                }
            }
        }
    }
}
