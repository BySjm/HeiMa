package HomeWork.T3;

public class TestDemo {
    public static void main(String[] args) {
        SuiDao sd = new SuiDao();
        for (int i = 1; i <= 10; i++) {
            new Thread(sd, "P" + i).start();
        }
    }
}
