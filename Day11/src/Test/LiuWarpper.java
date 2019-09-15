package Test;

public class LiuWarpper implements Star{

    private Liu liu;

    @Override
    public void sing() {
        System.out.println("巴拉巴拉");
        liu.sing();
        System.out.println("巴拉巴拉的，你是巴拉巴拉小魔仙啊！！");
    }

    @Override
    public void dance() {
        liu.dance();
    }
}
