package Test;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("2.txt"), "UTF-8");
        int read = isr.read();
        osw.write(read);
        osw.close();
        isr.close();
    }
}
