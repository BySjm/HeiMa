package TestDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestCopyFileDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\SanJiaoMao\\Desktop\\upload\\1.png");
        FileOutputStream fos = new FileOutputStream("copy.png");
        int b = 0;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(bytes)) != -1){
//            fos.write(bytes, 0, len);
//        }
        fos.close();
        fis.close();
    }
}
