package TestDemo;

import java.io.FileWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        Properties pp = new Properties();
        System.out.println(pp);//结果：{}
        pp.setProperty("username", "Jack");
        pp.setProperty("password", "123456");
        System.out.println(pp);
        System.out.println(pp.getProperty("username"));
        Set<String> set = pp.stringPropertyNames();
        for (String s : set) {
            System.out.println(s + "=" + pp.getProperty(s));
        }
        pp.store(new FileWriter("test.properties"),"Just Test");
    }
}
