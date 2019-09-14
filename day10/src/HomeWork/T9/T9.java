package HomeWork.T9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class T9 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Info.txt");
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            if (str.equals("886"))
                break;
            else{
                fw.write(str);
                fw.write("\r\n");
                fw.flush();
            }
        }
        fw.close();
    }
}
