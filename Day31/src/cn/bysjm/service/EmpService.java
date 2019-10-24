package cn.bysjm.service;

import cn.bysjm.dao.EmpDao;
import cn.bysjm.domain.Emp;
import cn.bysjm.domain.PageBean;
import cn.bysjm.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpService {

    public List<Emp> findAll() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        List<Emp> list = empDao.findAll();
        MyBatisUtils.close(sqlSession);
        return list;
    }

    public void dels(String[] values) {
        SqlSession sqlSession = MyBatisUtils.openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        empDao.dels(values);
        MyBatisUtils.close(sqlSession);
    }

    public PageBean<Emp> findByPage(Integer currentPage, Integer pageSize) {
        SqlSession sqlSession = MyBatisUtils.openSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        Integer totalCount = empDao.findByCount();
        int index = (currentPage - 1) * pageSize;
        List<Emp> list = empDao.findByList(index, pageSize);
        PageBean<Emp> pageBean = new PageBean<>();
        pageBean.setTotalCount(totalCount);
        Integer totalPage = (int) Math.ceil(totalCount * 1.0 / pageSize);
        pageBean.setTotalPage(totalPage);
        pageBean.setList(list);
        pageBean.setPageSize(pageSize);
        pageBean.setCurrentPage(currentPage);
        return pageBean;
    }
}
