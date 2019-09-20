package TestDemo;

import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("1.txt");
//        ps.print("123");

        System.setOut(ps);
        System.out.println("12344+218");
        ps.close();
    }
}
