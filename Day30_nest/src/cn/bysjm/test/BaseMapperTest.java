package cn.bysjm.test;

import cn.bysjm.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

public class BaseMapperTest {

    protected SqlSession sqlSession;

    @Before
    public void before(){
        sqlSession = MybatisUtils.openSession();
    }

    @After
    public void after(){
        sqlSession.commit();
        sqlSession.close();
    }
}
