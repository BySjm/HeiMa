package T6;

public class Duck extends Animal{

    public Duck(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getColor() + "的鸭子在吃饭");
    }

    public void swim() {
        System.out.println(getAge() + "岁的" + getColor() + "的鸭子在游泳");
    }
}
