package Thread;

public class ThreadDemo02 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("测试" + i);
                }
            }
        }).start();
        //thread.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("宝宝" + i);
        }
    }
}
