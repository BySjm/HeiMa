package cn.bysjm.test;

import cn.bysjm.domain.User;
import cn.bysjm.mapper.UserMapper;
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

}
