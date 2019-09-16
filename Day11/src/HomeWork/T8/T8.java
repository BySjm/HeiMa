package HomeWork.T8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class T8 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
        String line = "";
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null){
            list.add(line);
        }
        br.close();
        Collections.reverse(list);
        BufferedWriter bw = new BufferedWriter(new FileWriter("text1.txt"));
        for(int i = 0; i<list.size(); i++) {
            bw.write(list.get(i));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
