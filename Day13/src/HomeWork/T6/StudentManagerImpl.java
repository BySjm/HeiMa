package HomeWork.T6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerImpl implements StudentManager{

    public static void main(String[] args) throws Exception {
        System.out.println("请输入你要查询的姓名:");
        String name = new Scanner(System.in).next();
        new StudentManagerImpl().getStudentInfo(name);
    }

    @Override
    public void getStudentInfo(String name) throws Exception{
        ArrayList<Student> list = read();
        for (Student student : list) {
            if (student.getName().equals(name)){
                System.out.println(student);
                return;
            }
        }
        System.out.println("查询的学员不存在！");
    }

    private static ArrayList<Student> read() throws Exception{
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String info;
        while ((info = br.readLine()) != null){
            String[] infos = info.split(",");
            list.add(new Student(infos[0], Integer.parseInt(infos[1]), infos[2]));
        }
        return list;
    }
}
