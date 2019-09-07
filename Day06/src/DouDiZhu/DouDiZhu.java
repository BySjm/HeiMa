package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class DouDiZhu {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> cardBox = new LinkedHashMap<>();
        String[] flowers = {"♠", "♥", "♣", "♦"};
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index = 1;
        for (String num : nums) {
            for (String flower: flowers) {
                String card = flower + num;
                cardBox.put(index++, card);
            }
        }
        cardBox.put(53, "小王");
        cardBox.put(54, "大王");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 55; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < list.size() - 3; i++) {
            if(i % 3 == 0){
                p1.add(list.get(i));
            }else if (i % 3 == 1){
                p2.add(list.get(i));
            }else {
                p3.add(list.get(i));
            }
        }
        diPai.add(list.get(51));
        diPai.add(list.get(52));
        diPai.add(list.get(53));

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(diPai);
        
        lookCard(p1, cardBox);
        lookCard(p2, cardBox);
        lookCard(p3, cardBox);
        lookCard(diPai, cardBox);

    }

    private static void lookCard(ArrayList<Integer> list, LinkedHashMap<Integer, String> cardBox) {
        for (Integer index : list) {
            String card = cardBox.get(index);
            System.out.print(card + " ");
        }
        System.out.println();
    }
}
