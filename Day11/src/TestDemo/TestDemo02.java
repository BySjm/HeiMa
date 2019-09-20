package TestDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo02 {
    public static void main(String[] args) {
//        FileReader fr = null;
//        try {
//            fr = new FileReader("ReadMe.md");
//            int ch = fr.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try(FileReader fr = new FileReader("ReadMe.md"); FileWriter fw = new FileWriter("2.txt")) {
            fw.write(fr.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
