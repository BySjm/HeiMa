package T3;

public class Cat extends Animal{

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    public void catcher(){
        System.out.println(name + "猫抓老鼠");
    }

}
