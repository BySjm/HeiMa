package HomeWork.T9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class T9 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new FileReader("1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("2.txt"));
        BufferedReader br3 = new BufferedReader(new FileReader("3.txt"));
        String line = "";
        while ((line = br1.readLine()) != null){
            list.add(line);
        }
        while ((line = br2.readLine()) != null){
            list.add(line);
        }
        while ((line = br3.readLine()) != null){
            list.add(line);
        }
        br1.close();
        br2.close();
        br3.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("last.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
