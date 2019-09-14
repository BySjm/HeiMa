package HomeWork.T2;

import java.io.*;

public class T2 {
    public static void main(String[] args) throws IOException {
        //File file = new File("D:\\IDEA-workspace\\HomeWork");
        //System.out.println(getSize(file));
        //System.out.println(getSum(4));
        //System.out.println(getFB(8));

        //T5
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write('a');
        fos.close();
    }

    private static int getFB(int n) {
        if (n < 1)
            throw new RuntimeException("哥们整啥呢");
        else if (n <= 2)
            return 1;
        return getFB(n - 1) + getFB(n - 2);
    }

    private static int getSum(int n) {
        if (n == 1)
            return 1;
        else
            return n + getSum(n - 1);
    }

    private static long getSize(File file) {
        long length = 0;
        if (!file.exists() && file != null)
            throw new RuntimeException("文件不存在");
        if (file.isFile())
            length += file.length();
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                length += getSize(listFile);
            }
        }
        return length;
    }
}
