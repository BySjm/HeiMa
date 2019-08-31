package T2;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(getName() + "上课");
    }

    public void show(){
        eat();
        sleep();
        teach();
    }
}
