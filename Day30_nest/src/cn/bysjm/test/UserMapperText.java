package cn.bysjm.test;

import cn.bysjm.domain.User;
import cn.bysjm.mapper.UserMapper;
import cn.bysjm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperText extends BaseMapperTest{

    @Test
    public void testFindAllWithOrder() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAllWithOrder(41);
        for (User user : userList) {
            System.err.println(user);
        }
    }

    @Test
    public void testFindAllWithRole() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.findAllWithRole(41);
        for (User user : userList) {
            System.err.println(user);
        }
    }

    @Test
    public void testOneCache() throws Exception {
        SqlSession sqlSession = MybatisUtils.openSession();
        UserMapper userMapper1 = sqlSession.getMapper(UserMapper.class);
        User user1 = userMapper1.findById(41);
        System.err.println(user1);
//        sqlSession.clearCache();
        UserMapper userMapper2 = sqlSession.getMapper(UserMapper.class);
        User user2 = userMapper2.findById(41);
        System.err.println(user2);
    }
}
