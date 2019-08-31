package T3;

public class Animal {
    String name;
    String color;
    double price;

    public Animal(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void eat(){
        System.out.println(name + "在吃饭");
    }

}
