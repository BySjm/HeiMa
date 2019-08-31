package T3;

public class Dog extends Animal{

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    public void watch(){
        System.out.println(name + "狗看家");
    }
}
