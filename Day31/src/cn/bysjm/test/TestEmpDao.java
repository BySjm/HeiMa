package cn.bysjm.test;

import cn.bysjm.dao.EmpDao;
import cn.bysjm.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class TestEmpDao {
    public static void main(String[] args) {
        Integer totalPage = (int) Math.ceil(16 * 1.0 / 4);
        System.out.println(totalPage);
    }
}
