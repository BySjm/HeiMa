package cn.bysjm.decorate;

public class GamePhoneDecorate extends PhoneDecorate{
    public GamePhoneDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        System.out.println("打游戏");
        super.call();
    }
}
