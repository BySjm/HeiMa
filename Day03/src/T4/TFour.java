package T4;

public class TFour {
    public static void main(String[] args) {
        char[] cha = {'i','t','c','a','s','a'};
        System.arraycopy(cha, 1, cha, 5, 1);
        //遍历目标数组，在控制台输出字符串
        for (char c : cha) {
            System.out.print(c);
        }

    }
}
