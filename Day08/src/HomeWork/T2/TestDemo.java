package HomeWork.T2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Integer> s1 = service.submit(new MyCallable());
        Future<Integer> s2 = service.submit(new MyCallable());
        Future<Integer> s3 = service.submit(new MyCallable());

        System.out.println((s1.get() + s2.get() + s3.get()) / 3);

        service.shutdown();
    }
}
