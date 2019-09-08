package T12;

public class Test {
    public static void main(String[] args) {
        ArrayDemo<String> arr = new ArrayDemo<>();
        for (int i = 0; i < 15; i++) {
            arr.addElement("测试数据" + i);
        }
        System.out.println("数组中元素的个数:" + arr.size());
        System.out.println(arr);
    }
}
