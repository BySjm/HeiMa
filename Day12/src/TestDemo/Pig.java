package TestDemo;

public class Pig {
    int age;

    @Book(name = "三国演义", authors = {"罗欢中", "罗贯中"})
    public Pig(int age) {
        this.age = age;
    }

    public void eat() {
        @Book(price = 100, name = "其他的", authors = "一个")
        int hour = 10;
        System.out.println("children吃了" + hour + "小时");
    }
}
