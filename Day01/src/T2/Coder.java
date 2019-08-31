package T2;

public class Coder extends Person {

    public Coder(String name, int age) {
        super(name, age);
    }

    public void Write(){
        System.out.println(getName() + "敲代码");
    }

    public void show(){
        eat();
        sleep();
        Write();
    }

}
