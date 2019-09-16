package HomeWork.T10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class T10 {
    public static void main(String[] args) throws Exception{
        File file = new File("copyright.properties");
        if (!file.exists()){
            file.createNewFile();
        }
        Properties prop  = new Properties();
        prop.load(new FileInputStream("copyright.properties"));
        String str = prop.getProperty("count", "0");
        int count = Integer.parseInt(str);
        if (count >= 3){
            System.out.println("程序使用次数已满，请续费");
        }else {
            count++;
            System.out.println("运行次数" + count);
            prop.setProperty("count", String.valueOf(count));
            prop.store(new FileOutputStream("copyright.properties"), "");
        }
    }
}
