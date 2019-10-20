package cn.bysjm.Druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DruidUtils.getConnection();
        String sql = "delete from user where username = 'jack3'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int i = preparedStatement.executeUpdate();
        if (i > 0){
            System.out.println("success");
        }else {
            System.out.println("error");
        }
        DruidUtils.close(preparedStatement,connection);
    }
}
