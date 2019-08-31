package T8;

public class Maintainer extends AdminStaff{

    public Maintainer() {
    }

    public Maintainer(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNum() + " 的维护专员 " + getName() + " 在解决不能共享屏幕问题");
    }
}
