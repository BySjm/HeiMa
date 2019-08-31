package T8;

public class Lecturer extends Teacher{

    public Lecturer() {
    }

    public Lecturer(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNum() + " 的讲师 " + getName() + " 在讲课");
    }
}
