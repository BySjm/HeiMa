package ComCase;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("欢迎使用本系统");
        ArrayList<Student> stuList = new ArrayList<>();
        ArrayList<Teacher> teaList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.学员信息管理    2.教师信息管理    3.退出");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    studentManage(stuList, sc);
                    break;
                case 2:
                    teacherManage(teaList, sc);
                    break;
                case 3:
                    System.out.println("谢谢使用本系统，拜拜...");
                    return;
                default:
                    System.out.println("你输入的信息不正确，请重新输入....");
            }
        }
    }

    public static void studentManage(ArrayList<Student> list, Scanner sc){
        System.out.println("【学员信息管理】");
        while (true){
            System.out.println("1.添加学员    2.修改学员    3.删除学员    4.查询学员    5.返回");
            int option = sc.nextInt();
            switch (option){
                case 1 :
                    Utils.addStudent(list, sc);
                    break;
                case 2:
                    Utils.updateStudent(list, sc);;
                    break;
                case 3:
                    Utils.deleteStudent(list, sc);
                    break;
                case 4:
                    Utils.selectStudent(list);
                    break;
                case 5:
                    System.out.println("您已返回上一级菜单.");
                    return;
                default:
                    System.out.println("您输入的信息有误，请重新输入..");
            }
        }
    }

    public static void teacherManage(ArrayList<Teacher> list, Scanner sc){
        System.out.println("【教师信息管理】");
        while (true){
            System.out.println("1.添加讲师    2.修改讲师    3.删除讲师    4.查询讲师    5.返回");
            int option = sc.nextInt();
            switch (option){
                case 1 :
                    Utils.addTeacher(list, sc);
                    break;
                case 2:
                    Utils.updateTeacher(list, sc);;
                    break;
                case 3:
                    Utils.deleteTeacher(list, sc);
                    break;
                case 4:
                    Utils.selectTeacher(list);
                    break;
                case 5:
                    System.out.println("您已返回上一级菜单.");
                    return;
                default:
                    System.out.println("您输入的信息有误，请重新输入..");
            }
        }
    }

}
