package T8;

public abstract class Employee {
    private int num;
    private String name;

    public Employee() {
    }

    public Employee(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public abstract void work();

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
