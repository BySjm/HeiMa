package TestDemo;

public class Person {
    private int weight;

    public Person(int weight) throws WeightXXXException{
        if (weight > 300){
            throw new WeightXXXException("体重超标了");
        }else {
            this.weight = weight;
        }
    }
}
