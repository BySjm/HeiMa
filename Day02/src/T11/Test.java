package T11;

public class Test {
    public static void main(String[] args) {
        EGoods laptop = new Laptop("笔记本", "g10000", 10000);
        EGoods phone = new Phone("手机", "g10001", 5000);
        Goods fruit = new Fruit("苹果", "g20000", 50);
        ShoppingCart cart = new ShoppingCart();
        System.out.println("===========添加商品===========");
        cart.addGoods(laptop);
        cart.addGoods(phone);
        cart.addGoods(fruit);
        cart.showGoods();
        cart.total();
    }
}
