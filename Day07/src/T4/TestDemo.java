package T4;

public class TestDemo {

    public static void main(String[] args) {
        try {
            login("admin", "admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public static void login(String username, String password) throws LoginException{
        if (!username.equals("admin"))
            throw new  LoginException("用户名错误");
        else if (!password.equals("admin"))
            throw new LoginException("密码错误");
        else
            System.out.println("欢迎" + username);
    }

}
