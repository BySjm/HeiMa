package HomeWork.T1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File file = new File(str);
        if (!file.exists())
            file.createNewFile();
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.getParent());
        System.out.println(file.getName().substring(file.getName().lastIndexOf(".")));
    }
}
