package Demo04_ConcurrentHashMap;

public class TestDemo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

        t1.start();
        t2.start();

        //让主线程休眠一会，等待子线程添加完毕
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ConcurrentHashMapDemo.map.size());
    }
}
