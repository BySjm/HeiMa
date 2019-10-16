package cn.bysjm.decorate;

public class PhoneDemo {
    public static void main(String[] args) {
        HuaWeiMate30 hw = new HuaWeiMate30();
        hw.call();
        System.out.println("-----------------------------");
        PhoneDecorate game = new GamePhoneDecorate(hw);
        game.call();
        System.out.println("-----------------------------");
        PhoneDecorate music = new MusicPhoneDecorate(hw);
        music.call();
        System.out.println("-----------------------------");
        PhoneDecorate phone1 = new GamePhoneDecorate(new MusicPhoneDecorate(hw));
        phone1.call();
        System.out.println("-----------------------------");
        PhoneDecorate phone2 = new MusicPhoneDecorate(new GamePhoneDecorate(hw));
        phone2.call();
    }
}
