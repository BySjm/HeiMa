package cn.bysjm.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo01 {
    //user表 添加一条记录
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2.建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/web15", "root", "root");
        // 3.编写sql
//        String sql = "insert into user values(null,'sjm','123')";
        String sql = "select * from user";
        // 4.获取sql执行对象
        Statement statement = connection.createStatement();
        // 5.执行sql并返回结果
//        int i = statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        // 6.处理结果
//        if (i > 0){+
//            System.out.println("成功");
//        }else {
//            System.out.println("失败");
//        }
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("编号："+id +"  用户名："+username+"  密码："+password);
        }
        // 7.释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
