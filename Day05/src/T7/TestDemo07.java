package T7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestDemo07 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23, "男"));
        list.add(new Student("李四", 24, "女"));
        list.add(new Student("张", 25, "男"));

        System.out.println(list);
        //change(list);
        System.out.println("-------------------------------------");
        change2(list);
        System.out.println(list);
    }

    public static void change(ArrayList<Student> list){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        System.out.println(list);
        Student student = list.get(0);
        student.setName("小猪佩奇");
    }

    public static void change2(ArrayList<Student> list){
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() > list.get(index).getAge()){
                index = i;
            }
        }
        list.get(index).setName("小猪佩奇");
    }

}
