package TestDemo;

import java.io.*;
import java.util.*;

public class TestDemo01 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
        String line = null;
        while ((line = br.readLine()) != null){
            String[] split = line.split("\\.");
            map.put(split[0], split[1]);
        }
        br.close();
        for (int i = 1; i <= map.size(); i++) {
            String key = String.valueOf(i);
            String value = map.get(key);
            bw.write(key + "." + value);
            bw.newLine();
        }
        bw.close();
    }
}
