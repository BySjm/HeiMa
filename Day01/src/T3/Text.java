package T3;

public class Text {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财", "白", 1000);
        dog.eat();
        dog.watch();
        System.out.println("-------------");
        Cat cat = new Cat("波斯猫", "美国金", 6666.66);
        cat.eat();
        cat.catcher();
    }
}
