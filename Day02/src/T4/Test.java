package T4;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.playGame();
    }
}
