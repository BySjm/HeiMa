package Demo01_SingleInstance;

public class Cat {
    private String name;
    private int age;

    private Cat(){

    }

    private Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    private static Cat cat = new Cat("Tom", 20);

    public static Cat getInstance(){
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
