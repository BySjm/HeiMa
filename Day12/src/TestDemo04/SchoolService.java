package TestDemo04;

public interface SchoolService {

    String login(String username, String password) throws InterruptedException;

    int searchMyScore() throws InterruptedException;

    String buyCourse(int money) throws InterruptedException;

}
