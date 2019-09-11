package Demo09_ThreadPoolTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> result = service.submit(new MyCallable(100));
        System.out.println(result.get());
        service.shutdown();
    }

}
