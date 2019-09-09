package T5;

import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(sum());
            }
        }).start();
    }

    public static int sum(){
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += new Random().nextInt(901) + 100;
        }
        return sum;
    }

}
