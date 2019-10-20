package cn.bysjm.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web15", "root", "root");
        Statement statement = connection.createStatement();
        String sql = "delete from user where id = 4";
        int i =statement.executeUpdate(sql);
        if (i > 0){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
        statement.close();
        connection.close();
    }
}
