package T8;

public class Buyer extends Employee{

    public Buyer() {
    }

    public Buyer(int num, String name) {
        super(num, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 "+getNum() + " 的采购专员 " + getName() + " 在采购音响设备");
    }
}
