package cn.bysjm.dao;

import cn.bysjm.domain.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();

    void dels(String[] values);

    Integer findByCount();

    List<Emp> findByList(@Param("index") Integer index, @Param("pageSize") Integer pageSize);

}
