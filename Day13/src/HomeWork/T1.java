package HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

//一.猜数字小游戏；
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //生成随机数
        int count = (int) (Math.random() * 100);
        int num;
        while (true) {
            System.out.println("请猜吧:(范围是:0-100)");
            try {
                num = sc.nextInt();
                if (num > 100 || num < 0) {
                    System.out.println("请输入0-100的正整数,不张眼吗！！！！");
                } else if (num > count) {
                    System.out.println("你猜的数字太大了");
                } else if (num < count) {
                    System.out.println("你猜的数字太小了");
                } else if (num == count) {
                    System.out.println("恭喜你猜对了");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("兄弟你有点皮啊,给老子输入数字!");
                //在控制台输入非法数据的时候，清理nextInt()中的缓存数据
                sc.next();
            }
        }
    }
}
