package cn.bysjm.mapper;

import cn.bysjm.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllWithOrder(Integer id);

    List<User> findAllWithRole();

}
