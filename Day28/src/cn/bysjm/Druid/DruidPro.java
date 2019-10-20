package cn.bysjm.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.xa.DruidXADataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidPro {
    public static void main(String[] args) throws Exception {
        InputStream druid = DruidPro.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(druid);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        System.out.println("连接池对象"+dataSource);
        for (int i = 1; i <= 11; i++) {
            Connection connection = dataSource.getConnection();
            System.out.println(i + ":" + connection);
            connection.close();
        }
        System.out.println("使用了连接池："+dataSource);
    }
}
