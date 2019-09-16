package HomeWork.T6;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class T6 {
    public static void main(String[] args) throws Exception{
        String content = "我爱Java";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"), "GBK");
        osw.write(content);
        osw.close();
    }
}
