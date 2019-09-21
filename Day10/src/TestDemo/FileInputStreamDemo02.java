package TestDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        byte[] bytes = new byte[4];
        int len = 0;
        while ((len = fis.read(bytes)) != -1)
            System.out.print(new String(bytes, 0, len));
    }
}
