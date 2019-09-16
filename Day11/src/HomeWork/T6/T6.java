package HomeWork.T6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class T6 {
    public static void main(String[] args) throws Exception{
        String content = "我爱Java";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"), "GBK");
        osw.write(content);
        osw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), "GBK");
        char[] chars = new char[10];
        int len = -1;
        while ((len = isr.read(chars)) != -1){
            System.out.println(new String(chars, 0, len));
        }
        isr.close();
    }
}
