package HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 五.编写斗地主洗牌发牌程序(排序版)，要求：程序要记录程序的运行次数。当程序累计
 *    运行超过三次，再启动，提示：试用到期，请续费！！
 */
public class T5 {
    public static void main(String[] args) throws Exception{
        File info = new File("info.txt");
        if (!info.exists()){
            FileOutputStream fos = new FileOutputStream("info.txt");
            fos.write("1".getBytes());
        }else {
            BufferedReader br = new BufferedReader(new FileReader("info.txt"));
            String line = br.readLine();
            int count = Integer.parseInt(line);
            if (count == 3){
                System.out.println("试用到期，请续费！！");
            }else {
                BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
                bw.write(String.valueOf(++count));
                bw.close();
                br.close();
                playPai();
            }
        }

    }

    private static void playPai(){
        HashMap<Integer, String> pai = new HashMap<>();
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String num : nums) {
            for (String color : colors) {
                pai.put(index++, color + num);
            }
        }
        pai.put(index++, "小王");
        pai.put(index++, "大王");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < 51 && i % 3 == 0) {
                p1.add(list.get(i));
            } else if (i < 51 && i % 3 == 1) {
                p2.add(list.get(i));
            } else if (i < 51) {
                p3.add(list.get(i));
            } else {
                diPai.add(list.get(i));
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(diPai);

        System.out.println("P1的牌是:");
        searchPai(pai, p1);
        System.out.println("P2的牌是:");
        searchPai(pai, p2);
        System.out.println("P3的牌是:");
        searchPai(pai, p3);
        System.out.println("底牌是:");
        searchPai(pai, diPai);
    }

    private static void searchPai(HashMap<Integer, String> map, ArrayList<Integer> list) {
        for (Integer integer : list) {
            String card = map.get(integer);
            System.out.print(card + " ");
        }
        System.out.println();
    }

}
