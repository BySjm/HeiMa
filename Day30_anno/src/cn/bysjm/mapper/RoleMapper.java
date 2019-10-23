package cn.bysjm.mapper;

import cn.bysjm.domain.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> findByUid(Integer id);

}
