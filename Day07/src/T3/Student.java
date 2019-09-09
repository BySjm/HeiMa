package T3;

public class Student {
    private String name;
    private double score;

    public Student(String name, double score){
        this.name = name;
        if (score < 0){
            throw new NegativeScore("分数为负数");
        }else {
            this.score = score;
        }
    }
}
