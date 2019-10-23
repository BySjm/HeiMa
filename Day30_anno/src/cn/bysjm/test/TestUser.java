package cn.bysjm.test;

import cn.bysjm.domain.User;
import cn.bysjm.mapper.UserMapper;
import cn.bysjm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TestUser extends BaseMapperTest {

    @Test
    public void testFindAll() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.err.println(user);
        }
    }

    @Test
    public void testSave() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("sjm");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京");
        userMapper.save(user);
    }

    @Test
    public void testUpdate() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(57);
        user.setUsername("sjmjl");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京");
        userMapper.update(user);
    }

    @Test
    public void testDelete() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delete(54);
    }

}
