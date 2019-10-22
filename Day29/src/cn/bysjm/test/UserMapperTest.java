package cn.bysjm.test;

import cn.bysjm.domain.User;
import cn.bysjm.util.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserMapperTest {
    @Test
    public void testFindAll() throws Exception {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("userMapper.findAll");
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testSave() throws Exception {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("sjm");
        user.setBirthday(new Date());
        user.setSex("boy");
        user.setAddress("peking");
        int insert = sqlSession.insert("userMapper.save", user);
        System.out.println(insert);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDelete() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Integer id = 51;
        sqlSession.delete("userMapper.delete", id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("bysjm");
        user.setId(50);
        int update = sqlSession.update("userMapper.update", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindById() throws Exception {
        SqlSession sqlSession = MybatisUtils.openSession();
        User user = sqlSession.selectOne("userMapper.findById", 50);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

}
