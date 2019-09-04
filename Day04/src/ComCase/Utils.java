package ComCase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Utils {
    public static int stuId;
    public static int teaId;

    static {
        stuId = 0;
        teaId = 0;
    }

    //年龄
    public static long getAge(String bir){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
        Date date = null;
        try {
             date = sdf.parse(bir);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
        Date dateNow = new Date();
        long dateNowTime = dateNow.getTime();
        long birTime = date.getTime();
        if (birTime > dateNowTime){
            return -1;
        }
        long age = dateNowTime - birTime;
        age = age / 1000 / 24 / 60 / 60 / 365;
        return age;
    }
    //打印一个ArrayList集合的Person对象
    public static void printArrayList(ArrayList<? extends Person> list){
        if (list.isEmpty()){
            System.out.println("没有学员信息...");
        }else {
            System.out.println("******************************************************");
            System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("******************************************************");
        }
    }

    //增加学员
    public static void addStudent(ArrayList<Student> list, Scanner sc){
        String[] add = add(sc);
        Student student = new Student(++Utils.stuId, add[0], add[1], add[2]);
        list.add(student);
        System.out.println("添加成功");
    }
    //修改学员信息
    public static void updateStudent(ArrayList<Student> list, Scanner sc){
        System.out.println("请输入你要更新的学员的ID");
        int id = sc.nextInt();
        for (Student s : list) {
            if (s.getId() == id) {
                System.out.println("被修改的学员信息为");
                System.out.println(s);
                update(s, sc);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("亲输入的信息有误");
    }

    //删除学员信息
    public static void deleteStudent(ArrayList<Student> list, Scanner sc){
        System.out.println("请输入你要删除的学员的ID");
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId() == id){
                System.out.println("将要删除的学员的信息为");
                System.out.println(s);
                System.out.println("你确定要删除吗？Y/N");
                String option = sc.next();
                if ("Y".equals(option)){
                    list.remove(i);
                    System.out.println("该学员已被删除");
                    return;
                }
                if ("N".equals(option)){
                    System.out.println("操作已经被取消");
                    return;
                }else {
                    System.out.println("你输入的有误，请重新输入");
                    return;
                }
            }
        }
        System.out.println("您输入的学员不存在");
    }

    //展示学员信息
    public static void selectStudent(ArrayList<Student> list){
        Utils.printArrayList(list);
    }

    //增加讲师
    public static void addTeacher(ArrayList<Teacher> list, Scanner sc){
        String[] add = add(sc);
        Teacher teacher = new Teacher(++Utils.teaId, add[0], add[1], add[2]);
        list.add(teacher);
        System.out.println("添加成功");
    }

    //增加
    private static String[] add(Scanner sc){
        System.out.println("请输入的你的名字：");
        String name = sc.next();
        System.out.println("请输入你的性别：");
        String sex = sc.next();
        System.out.println("请输入你的生日：（格式：1996-11-11）");
        String bir = sc.next();
        String[] inf = {name, sex, bir};
        return inf;
    }

    //修改讲师信息
    public static void updateTeacher(ArrayList<Teacher> list, Scanner sc){
        System.out.println("请输入你要更新的讲师的ID");
        int id = sc.nextInt();
        for (Teacher t : list) {
            if (t.getId() == id) {
                System.out.println("被修改的讲师信息为");
                System.out.println(t);
                update(t,sc);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("亲输入的信息有误");
    }

    //更新
    private static void update(Person t, Scanner sc){
        System.out.println("请输入新姓名：(不需要更改请输入0)");
        String name = sc.next();
        System.out.println("请输入新性别：(不需要更改请输入0)");
        String sex = sc.next();
        System.out.println("请输入新生日：(不需要更改请输入0)");
        String bir = sc.next();
        String[] update = {name, sex, bir};
        if (!"0".equals(name)){
            t.setName(name);
        }
        if (!"0".equals(sex)){
            t.setSex(sex);
        }
        if (!"0".equals(bir)){
            t.setBirthday(bir);
        }
    }

    //删除讲师信息
    public static void deleteTeacher(ArrayList<Teacher> list, Scanner sc){
        System.out.println("请输入你要删除的讲师的ID");
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            if (t.getId() == id){
                System.out.println("将要删除的讲师的信息为");
                System.out.println(t);
                System.out.println("你确定要删除吗？Y/N");
                String option = sc.next();
                if ("Y".equals(option)){
                    list.remove(i);
                    System.out.println("已被删除");
                    return;
                }
                if ("N".equals(option)){
                    System.out.println("操作已经被取消");
                    return;
                }else {
                    System.out.println("你输入的有误，请重新输入");
                    return;
                }
            }
        }
        System.out.println("您输入的讲师不存在");
    }

    //展示讲师信息
    public static void selectTeacher(ArrayList<Teacher> list){
        Utils.printArrayList(list);
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }
}
