package HomeWork.T5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) throws Exception{
        PrintStream ps = new PrintStream("data.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3个字符串验证码");
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第" +  i + "个字符串验证码");
            ps.println(sc.next());
        }
        ps.close();
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println("请输入你要验证的验证码:");
        String code = sc.next();
        String verificationCode = null;
        ArrayList<String> list = new ArrayList<>();
        while ((verificationCode = br.readLine()) != null){
            list.add(verificationCode);
        }
        System.out.println(list);
        if (list.contains(code))
            System.out.println("验证成功");
        else
            System.out.println("验证失败");
    }
}
