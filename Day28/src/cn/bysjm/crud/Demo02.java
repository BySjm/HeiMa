package cn.bysjm.crud;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {

    @Test
    public void text() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web15", "root", "root");
        Statement statement = connection.createStatement();
        String sql = "update user set username = 'jack4' where id = 1";
        int i = statement.executeUpdate(sql);
        if (i > 0){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
        statement.close();
        connection.close();
    }
}
