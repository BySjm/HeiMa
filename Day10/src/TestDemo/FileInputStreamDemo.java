package TestDemo;

import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("1.txt");
        int b = 0;
        while ( (b = fis.read()) != -1){
            System.out.println((char) b);
        }
    }
}
