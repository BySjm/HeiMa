package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        Properties pp = new Properties();
        pp.load(new FileInputStream("mysql.properties"));
        Set<String> set = pp.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + "=" + pp.getProperty(s));

        }
    }

}
