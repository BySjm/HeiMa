package T2;

import java.util.ArrayList;

public class T2 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张");
        System.out.println(listTest(list1, "张"));
        System.out.println(listTest(list1));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(4);
        list2.add(3);
        list2.add(6);
        System.out.println("第一次出现2的索引" + listTest(list2, 2));
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }

    public static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == s)
                return i;
        }
        return -1;
    }

}
