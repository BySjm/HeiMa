package cn.bysjm.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudDemoPro {
    @Test
    public void test() throws SQLException {
        Connection connection = JdbcUtilsPro.getConnection();
        String sql = "select * from user";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println(id + "     " + username + "     " + password);
        }
        JdbcUtilsPro.close(resultSet,statement, connection);
    }

}
