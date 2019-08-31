package T7;

public class Text {
    public static void main(String[] args) {
        Manger manger = new Manger("m110", "老王", 10000.0);
        manger.eat();
        manger.work();
        Cooker cooker = new Cooker("c110", "小王", 6000.0);
        cooker.eat();
        cooker.work();
    }
}
