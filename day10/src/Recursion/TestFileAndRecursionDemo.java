package Recursion;

import java.io.File;

public class TestFileAndRecursionDemo {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA-workspace\\HomeWork");
        getJava(file);
    }

    private static void getJava(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".java"))
                System.out.println(f.getAbsolutePath());
            else if (f.isDirectory()){
                getJava(f);
            }
        }
    }


}
