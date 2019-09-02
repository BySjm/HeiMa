package T9;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void call() {

            }

            @Override
            public void sendMessage() {

            }
        };
        phone.call();
        phone.sendMessage();
    }
}
