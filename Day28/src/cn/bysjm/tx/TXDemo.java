package cn.bysjm.tx;

import cn.bysjm.util.JdbcUtilsPro;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TXDemo {
    @Test
    public void testTX(){
        Connection connection = null;
        Statement statement = null;
        try{
            // 1.获取连接【JdbcUtils工具类】
            connection = JdbcUtilsPro.getConnection();
            // 2.开启事务
            connection.setAutoCommit(false);
            // 3.谦谦扣钱
            statement = connection.createStatement();
            String sql1 = "update account set balance = balance - 100 where id = 1";
            int i = statement.executeUpdate(sql1);
            if (i > 0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
            int i2 = i / 0;
            // 4.小路加钱
            String sql2 = "update account set balance = balance + 100 where id = 2";
            int i1 = statement.executeUpdate(sql2);
            if (i1 > 0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
            // 5.提交事务
            connection.commit();
        }catch(Exception e){
            System.out.println("事务回滚了");
            // 6.回滚事务
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally{
            // 7.释放资源
            JdbcUtilsPro.close(statement,connection);
        }
    }
}
