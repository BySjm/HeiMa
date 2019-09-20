package HomeWork04;

public class T4 {
    public static void main(String[] args) {
        String str = "E:\\Workspace\\201909\\day14\\RegexTest.java";
        String[] split = str.split("\\\\");
        for (String s : split) {
            System.out.print(s);
        }
    }
}
