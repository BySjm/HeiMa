package T7;

public class Cooker extends Person{

    public Cooker(String num, String name, double salary) {
        super(num, name, salary);
    }

    @Override
    public void eat() {
        System.out.println("工号为：" + getNum() + ",姓名为：" + getName() + ",工资为：" + getSalary() + "的厨师在吃肉");
    }

    @Override
    public void work() {
        System.out.println("工号为：" + getNum() + ",姓名为：" + getName() + ",工资为：" + getSalary() + "的厨师在工作，炒菜");
    }
}
