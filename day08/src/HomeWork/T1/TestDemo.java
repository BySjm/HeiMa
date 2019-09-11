package HomeWork.T1;

public class TestDemo {

    public static void main(String[] args) {

        Seller seller = new Seller();

        Thread s1 = new Thread(seller, "实体店");
        Thread s2 = new Thread(seller, "网店");
        s1.start();
        s2.start();
    }

}
