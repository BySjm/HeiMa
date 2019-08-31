package T6;

public class Cock extends Animal{

    public Cock(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在啄米");
    }

    public void daMing() {
        System.out.println(getAge() + "岁的" + getColor() + "的公鸡在打鸣");
    }
}
