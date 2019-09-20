package HomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 四.假如在项目根目录下有一个用户文件：user.txt，里面记录了用户的用户名和密码信息，
 *    例如：user.txt
 *  --------------------
 * 	admin,1111
 * 	zhangsan,222
 * 	lisi,333
 * 	--------------------
 *  程序启动，请用户输入"用户名"和"密码"，如果正确，提示登录成功，程序结束。
 *  如果连续三次输入失败，提示用户：你的账户被锁定10小时！程序结束。
 */
public class T4 {
    public static void main(String[] args) throws Exception{
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        String line = null;
        while ((line = br.readLine()) != null){
            String[] splits = line.split(",");
            map.put(splits[0], splits[1]);
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            if (map.containsKey(username) && map.get(username).equals(password)){
                System.out.println("登录成功，程序结束");
                break;
            }else if (i < 2){
                System.out.println("请重新验证");
            }else {
                System.out.println("你的账户被锁定10小时！程序结束。");
            }
        }
    }
}
