package T8;

public abstract class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(int num, String name) {
        super(num, name);
    }

    @Override
    public abstract void work();
}
