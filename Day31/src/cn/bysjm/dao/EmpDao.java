package cn.bysjm.dao;

import cn.bysjm.domain.Emp;
import cn.bysjm.domain.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();

    void dels(String[] values);

    Integer findByCount();

    List<Emp> findByList(@Param("index") Integer index, @Param("pageSize") Integer pageSize);

    Integer findByConditionCount(QueryVo queryVo);

    List<Emp> findByConditionList(QueryVo queryVo);

    Emp updateData(int id);

    void update(Emp emp);

    void addEmp(Emp emp);
}
