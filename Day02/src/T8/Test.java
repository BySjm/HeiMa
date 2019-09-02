package T8;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
        if (dog instanceof Dog){
            ((Dog)dog).lookHome();
        }else if (cat instanceof Cat){
            ((Cat) cat).catchMouse();
        }
    }
}
