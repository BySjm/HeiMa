package demo08_Exchanger;

import java.util.concurrent.Exchanger;

public class TestExchangerDemo {

    public static void main(String[] args) {
        //线程间传递数据的桥梁
        Exchanger ex = new Exchanger();
        new ThreadA(ex).start();
        new ThreadB(ex).start();
    }

}
