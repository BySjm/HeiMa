package TestDemo_Regx;

public class TestDemo01 {
    public static void main(String[] args) {
        //输入一个QQ号码,判断该号码是否符合规则
//        QQ号码必须是5--15位长度
//        而且必须全部是数字
//        而且首位不能为0
        String str = "1183781747";
        boolean b = str.matches("[1-9][0-9]{4,14}");
        System.out.println(b);
        //1.验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        String str1 = "hod";
        boolean b1 = str1.matches("h[aeiou]d");
        System.out.println(b1);
        //2.验证str是否3位数字
        String str2 = "123";
        boolean b2 = str2.matches("[1-9][0-9]{2}");
        System.out.println(b2);
        //验证这个序列号：分为5组，每组之间使用-隔开，每组由5位A-Z或者0-9的字符组成
        String str3 = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";
        boolean b3 = str3.matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}");
        System.out.println(b3);
        //4.验证str是否以a-d或者m-p之间某个字符开头，后跟ad
        String str4 = "bad";
        boolean b4 = str4.matches("[a-dm-p]ad");
        System.out.println(b4);
        //分割字符串
        String str5 = "18 4 567 99 56";
        String[] split = str5.split(" +");
        for (String s : split) {
            System.out.print(s);
        }
        System.out.println();
        //将下面字符串中的"数字"替换为"*"
        String str6 = "我去你大爷的去你大爷的去你大爷的去你大爷的去你大爷的去你大爷的,真是个傻逼";
        String replace = str6.replaceAll("[去你大爷的|傻逼]+", "***");
        System.out.println(replace);
    }
}
