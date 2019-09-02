package T6;

public class Phone extends Person{
    @Override
    public void boot() {
        System.out.println("手机的开机");
    }

    @Override
    public void shutDown() {
        System.out.println("手机的关机");
    }

    @Override
    public void game() {
        System.out.println("玩一局王者荣耀~");
    }
}
