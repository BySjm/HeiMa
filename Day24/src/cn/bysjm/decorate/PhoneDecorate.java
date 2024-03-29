package cn.bysjm.decorate;

public class PhoneDecorate implements Phone{

    private Phone phone;

    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }
}
