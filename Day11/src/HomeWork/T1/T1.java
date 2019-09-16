package HomeWork.T1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class T1 {
    public static void main(String[] args) throws Exception{
        Properties pp = new Properties();
        pp.load(new FileInputStream("score.txt"));
        Set<String> set = pp.stringPropertyNames();
        for (String s : set) {
            if (s.equals("lisi")){
                pp.setProperty(s, "100");
            }
        }
        pp.store(new FileOutputStream("score.txt"), "1");
    }
}
