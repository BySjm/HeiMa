package TestDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TestDemo03 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream bufin = new BufferedInputStream(new FileInputStream("123.txt"));
        int len = 0;
        while ((len = bufin.read()) != -1) {
            System.out.print((char) len);
        }
        bufin.close();
    }
}
