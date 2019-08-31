package T8;

public abstract class AdminStaff extends Employee{

    public AdminStaff() {
    }

    public AdminStaff(int num, String name) {
        super(num, name);
    }

    public abstract void work();

}
