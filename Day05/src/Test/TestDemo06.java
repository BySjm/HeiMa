package Test;

import java.util.ArrayList;

public class TestDemo06 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();


        //TestDemo06.method1(list1);  //有错位
        TestDemo06.method1(list2);
        TestDemo06.method1(list3);
        //TestDemo06.method1(list4);  //有错位


        //TestDemo06.method2(list1);  //有错位
        //TestDemo06.method2(list2);  //有错位
        TestDemo06.method2(list3);
        TestDemo06.method2(list4);

    }

    //Number及其子类
    public static void method1(ArrayList<? extends Number> list){

    }
    //Number及其父类
    public static void method2(ArrayList<? super Number> list){

    }

}
