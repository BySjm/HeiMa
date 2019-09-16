package HomeWork.T3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class T3 {
    public static void main(String[] args) throws Exception{
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\e.txt"));
        bos.write("I love java".getBytes());
        bos.close();
    }
}
