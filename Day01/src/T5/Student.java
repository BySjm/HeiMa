package T5;

public class Student extends Person{
    private int score;

    public Student() {
    }

    public Student(int score) {
        this.score = score;
    }

    public void kaoShi(){
        System.out.println(getName() + "同学，考试得了：" + getScore() + "分");
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
