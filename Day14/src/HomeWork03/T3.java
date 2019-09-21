package HomeWork03;

public class T3 {
    public static void main(String[] args) {
        String str = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
        String replace = str.replaceAll("[\\.]+", "");
        String s = replace.replaceAll("(.)\\1+", "$1");
        System.out.println(s);
    }
}