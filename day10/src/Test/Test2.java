package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("测试文件.txt");
        int temp = 0;
        while ((temp = fis.read()) != -1) {
            fos.write(temp);
        }
        fis.close();
        fos.close();
    }
}
