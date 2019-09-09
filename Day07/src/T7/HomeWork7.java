package T7;

public class HomeWork7 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int v = 1;
                for (int i = 10; i > 0; i--) {
                    v *= i;
                }
                System.out.println(v);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int v = 1;
                for (int i = 8; i > 0; i--) {
                    v *= i;
                }
                System.out.println(v);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int v = 1;
                for (int i = 5; i > 0; i--) {
                    v *= i;
                }
                System.out.println(v);
            }
        }).start();
    }
}
