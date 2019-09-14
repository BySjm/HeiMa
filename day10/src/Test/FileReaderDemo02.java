package Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        char[] chars = new char[4];
        int len = 0;
//        fr.read(chars);
//        System.out.println(new String(chars));

        while ((len = fr.read(chars)) != -1)
            System.out.print(new String(chars, 0, len));

    }
}
