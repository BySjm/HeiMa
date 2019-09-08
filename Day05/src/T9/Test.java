package T9;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("z1", "增加了", "19", "SYHM"));
        Student stu = list.get(0);
        Student student = new Student("z1", "增加了", "22", "SYHM");
        stu.setName(student.getName());
        stu.setName(student.getAddress());
        stu.setName(student.getAge());
        System.out.println(list);
    }
}
