package cn.bysjm.login;

import cn.bysjm.util.JdbcUtilsPro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        Connection connection = JdbcUtilsPro.getConnection();
        Statement statement = connection.createStatement();
        String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        JdbcUtilsPro.close(resultSet,statement,connection);
    }
}
