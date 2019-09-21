package Demo01_SingleInstance;

public class Dog {
    private String name;
    private int age;

    public Dog(){

    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    private static Dog dd = null;

    public static Dog getInstance(){
        if (dd == null){
            dd = new Dog("旺财", 20);
        }
        return dd;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
