package TestDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("12.txt"));
        bw.newLine();
    }
}
