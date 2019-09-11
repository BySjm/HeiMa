package HomeWork.T2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int v = (int) (Math.random() * 100);
            sum += v;
        }
        return sum / 10;
    }
}
