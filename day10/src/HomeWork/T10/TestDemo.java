package HomeWork.T10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();
        FileWriter fw = new FileWriter("Student.txt");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            String[] pro = str.split(",");
            list.add(new Student(pro[0], pro[1], pro[2], pro[3]));
        }
        for (Student student : list) {
            fw.write(student.getNum() + "," + student.getName()+ "," + student.getGender());
            fw.write("\r\n");
            fw.flush();
        }
        fw.close();
    }
}
