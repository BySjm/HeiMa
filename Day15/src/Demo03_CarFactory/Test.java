package Demo03_CarFactory;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCat("002");
        car.run();
    }
}
