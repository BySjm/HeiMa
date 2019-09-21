package Demo07_Semaphore;

import java.util.concurrent.Semaphore;

public class TestSemaphoreDemo {

    public static void main(String[] args) {
        Semaphore sp = new Semaphore(1);
        for (int i = 0; i < 5; i++) {
            new MyThread(sp).start();
        }
    }

}
