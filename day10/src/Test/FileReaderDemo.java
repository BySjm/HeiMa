package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        int b = 0;
        while ((b = fr.read()) != -1)
            System.out.println((char) b);
        fr.close();
    }
}
