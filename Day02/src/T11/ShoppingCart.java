package T11;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Goods> good = new ArrayList<>();

    public ShoppingCart() {
    }

    public void addGoods(Goods goods){
        good.add(goods);
        System.out.println("加入 " + goods.getName() + " 成功");
    }

    public void showGoods(){
        System.out.println("===========打印商品===========");
        System.out.println("您选购的商品为:");
        Goods goods;
        for (int i = 0; i < good.size(); i++) {
            goods = good.get(i);
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }

    public void total(){
        double off = 0;
        double sum = 0;
        for (int i = 0; i < good.size(); i++) {
            Goods goods = good.get(i);
            double price = goods.getPrice();
            sum += price;
            if (goods instanceof EGoods){
                price *= 0.88;
            }
            off += price;
        }
        System.out.println("----------------------");
        System.out.println("原 价为:" + sum);
        System.out.println("折后价位:" + off);
    }
}
