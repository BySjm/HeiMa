package T8;

public class Tutor extends Teacher{

    public Tutor() {
    }

    public Tutor(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNum() + " 的讲师 " + getName() + " 在帮助学生解决问题");
    }
}
