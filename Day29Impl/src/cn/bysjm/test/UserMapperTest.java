package cn.bysjm.test;

import cn.bysjm.domain.QueryVo;
import cn.bysjm.domain.User;
import cn.bysjm.mapper.UserMapper;
import cn.bysjm.util.MybatisUtils;
import com.sun.security.jgss.GSSUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testFindAll() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(50);
        User user1 = userMapper.findTest(user);
        System.out.println(user1);
    }

    @Test
    public void testSave() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("UZI");
        user.setBirthday(new Date());
        user.setSex("boy");
        user.setAddress("上海");
        userMapper.save(user);
    }

    @Test
    public void testUpdate() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(52);
        user.setAddress("北京");
        userMapper.update(user);
    }

    @Test
    public void testFidById() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(50);
        System.out.println(user);
    }

    @Test
    public void testDelete() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.delete(46);
    }

    @Test
    public void testFindByParam() throws Exception {
        User bysjm = sqlSession.getMapper(UserMapper.class).findByParam(50, "bysjm");
        System.out.println(bysjm);
    }

    @Test
    public void testFindByUserName() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.findByUserName("王");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSaveForId() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("ThyShy");
        user.setBirthday(new Date());
        user.setSex("boy");
        user.setAddress("上海");
        userMapper.saveForId(user);

        System.out.println(user.getId());
    }

    @Test
    public void testFindByIdAndUsernameIf() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
//        user.setId(54);
//        user.setUsername("王");
        List<User> users = userMapper.findByIdAndUsernameIf(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test
    public void testFindByIdAndUsernameChoose() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        //        user.setId(54);
        //user.setUsername("王");
        List<User> users = userMapper.findByIdAndUsernameChoose(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test
    public void testUpdateIf() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(55);
        user.setUsername("ThyShy哥");
        userMapper.updateIf(user);
    }

    @Test
    public void testFindByList() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(42);
        list.add(43);
        List<User> users = userMapper.findByList(list);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByArray() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int[] ids = {41, 42, 43};
        List<User> users = userMapper.findByArray(ids);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByPojo() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(42);
        list.add(43);
        queryVo.setIds(list);
        List<User> users = userMapper.findByPojo(queryVo);
        for (User user : users) {
            System.out.println(user);
        }
    }

}
