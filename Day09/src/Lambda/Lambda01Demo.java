package Lambda;

public class Lambda01Demo {
    public static void main(String[] args) {
        new Thread( () -> System.out.println("123"));
        new Thread( () -> {
            System.out.println("13");
            System.out.println("45");
        });
    }
}
