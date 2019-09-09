package Exception;

import javax.security.auth.login.LoginException;
import java.util.Objects;

public class Demo {
    private static String[] names = {"bili", "hill", "jll"};

    public static void main(String[] args) {

        try {
            checkUsername("bili");
            System.out.println("注册成功！");
        } catch (LoginException e) {
            e.printStackTrace();
        }

        method();

    }

    public static boolean checkUsername (String userName) throws LoginException {
        for (String name : names) {
            if (userName.equals(name))
                throw new LoginException("亲" + name + "已经被注册了");
        }
        return true;
    }

    public static void method(){
        throw new RuntimeException("有人");
    }

}
