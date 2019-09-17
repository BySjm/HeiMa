package TestDemo;

public class Cat {
    private int age;
    private String name;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    private Cat(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void method1(int age) {
        System.out.println(age);
    }

    public void method2(int age, String name) {
        System.out.println("姓名:" + name + ",年龄" + age);
    }

    private void method3(String name){
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
