package T10;

import java.util.LinkedList;

public class LinkedListDemoTest {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<Person>();
        list.add(new Person("zjl", "男", 18));
        list.add(new Person("zz", "女", 19));
        list.add(new Person("zj", "不男不女", 20));
        list.add(new Person("jl", "男", 21));
        System.out.println("-----------------------------------");
        addEle(list, new Person("jl", "男", 22));
    }

    public static <E> void addEle(LinkedList<E> list, E e) {
        for (E e1 : list) {
            if (e.equals(e1)) {
                System.out.println("集合中已经存在该元素");
                return;
            }
        }
        System.out.println("添加成功");
        list.add(e);
    }
}
