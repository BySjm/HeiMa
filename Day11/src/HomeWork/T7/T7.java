package HomeWork.T7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class T7 {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张京龙", 23, "男"));
        list.add(new Student("钱宝宝", 19, "女"));
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"));
        ArrayList<Student> students = (ArrayList<Student>)ois.readObject();
        for (Student student : students) {
            System.out.println(student);
        }
        ois.close();
    }
}
