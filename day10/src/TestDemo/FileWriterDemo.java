package TestDemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("1.txt");
        fw.write('a');
        fw.flush();
        fw.close();
    }
}
