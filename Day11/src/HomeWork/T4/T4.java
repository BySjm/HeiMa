package HomeWork.T4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class T4 {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));
        int b = -1;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
