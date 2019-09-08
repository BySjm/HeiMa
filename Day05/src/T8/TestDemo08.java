package T8;

import java.util.ArrayList;

public class TestDemo08 {
    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>();
        list.add(new People("张三", 180));
        list.add(new People("张四", 175));
        list.add(new People("张五", 170));
        list.add(new People("张六", 165));
        list.add(new People("李四", 160));
        find(list);
    }

    private static void find(ArrayList<People> list) {
        int highest = 0;
        int shortest = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getHeight() > list.get(highest).getHeight())
                highest = i;
            else
                shortest = i;
        }
        People high = list.get(highest);
        People low = list.get(shortest);
        System.out.println("最高的人是" + high.getName() + ",身高" + high.getHeight());
        System.out.println("最矮的人是" + low.getName() + ",身高" + low.getHeight());
    }
}
