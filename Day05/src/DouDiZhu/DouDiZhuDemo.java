package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhuDemo {
    public static void main(String[] args) {
        String[] flowers = {"♥","♣","♦","♠"};
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        ArrayList<String> cardBox = new ArrayList<>();
        for (String flower: flowers) {
            for (String num : nums) {
                String card = flower + num;
                cardBox.add(card);
            }
        }
        cardBox.add("大王");
        cardBox.add("小王");
        Collections.shuffle(cardBox);
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < cardBox.size() - 3; i++) {
            if (i % 3 == 0){
                p1.add(cardBox.get(i));
            }else if (i % 3 == 1){
                p2.add(cardBox.get(i));
            }else {
                p3.add(cardBox.get(i));
            }
        }
        diPai.add(cardBox.get(51));
        diPai.add(cardBox.get(52));
        diPai.add(cardBox.get(53));

        System.out.println("P1的牌" + p1);
        System.out.println("P2的牌" + p2);
        System.out.println("P3的牌" + p3);
        System.out.println("底牌" + diPai);

    }
}
