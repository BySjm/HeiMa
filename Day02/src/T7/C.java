package T7;

public class C implements A,B{

    private int sum = 0;

    @Override
    public void show() {
        System.out.println(sum);
    }

    @Override
    public void add(int a, int b) {
        sum = a + b;
    }
}
