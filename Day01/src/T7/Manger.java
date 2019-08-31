package T7;

public class Manger extends Person{

    public Manger(String num, String name, double salary) {
        super(num, name, salary);
    }

    @Override
    public void eat() {
        System.out.println("工号为：" + getNum() + ",姓名为：" + getName() + ",工资为：" + getSalary() + "的经理在吃鱼");
    }

    @Override
    public void work() {
        System.out.println("工号为：" + getNum() + ",姓名为：" + getName() + ",工资为：" + getSalary() + "的经理在工作，管理其他人");
    }
}
