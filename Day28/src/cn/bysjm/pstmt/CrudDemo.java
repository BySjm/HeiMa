package cn.bysjm.pstmt;

import cn.bysjm.util.JdbcUtils;
import cn.bysjm.util.JdbcUtilsPro;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudDemo {
    //增加
    @Test
    public void test1() throws SQLException {
        Connection connection = JdbcUtilsPro.getConnection();
        String sql = "insert into user(username,password) values('sjm','123')";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int update = preparedStatement.executeUpdate();
        if (update > 0){
            System.out.println("success");
        }else {
            System.out.println("error");
        }
        JdbcUtilsPro.close(preparedStatement,connection);
    }
    //改
    @Test
    public void test2() throws SQLException {
        Connection connection = JdbcUtilsPro.getConnection();
        String sql = "update user set username = 'bysjm' where id = 5";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int update = preparedStatement.executeUpdate();
        if (update > 0){
            System.out.println("success");
        }else {
            System.out.println("error");
        }
        JdbcUtilsPro.close(preparedStatement,connection);
    }
    //查
    @Test
    public void test3() throws SQLException {
        Connection connection = JdbcUtilsPro.getConnection();
        String sql = "select * from user";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("用户名:" + username);
        }
        JdbcUtilsPro.close(resultSet,preparedStatement,connection);
    }
    //删
    @Test
    public void test4() throws SQLException {
        Connection connection = JdbcUtilsPro.getConnection();
        String sql = "delete from user where username = 'bysjm'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int update = preparedStatement.executeUpdate();
        if (update > 0){
            System.out.println("success");
        }else {
            System.out.println("error");
        }
        JdbcUtilsPro.close(preparedStatement,connection);
    }
}
