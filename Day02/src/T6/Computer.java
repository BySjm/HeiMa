package T6;

public class Computer extends Person{
    @Override
    public void boot() {
        System.out.println("电脑开机~windows~");
    }

    @Override
    public void shutDown() {
        System.out.println("电脑关机~");
    }

    @Override
    public void game() {
        System.out.println("电脑打游戏，LOL,league of legends");
    }
}
