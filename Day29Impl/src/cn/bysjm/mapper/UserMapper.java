package cn.bysjm.mapper;

import cn.bysjm.domain.QueryVo;
import cn.bysjm.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findTest(User user);

    List<User> findAll();

    void save(User user);

    void update(User user);

    User findById(int id);

    void delete(int id);

    User findByParam(@Param("id") int id, @Param("username") String username);

    List<User> findByUserName(String username);

    void saveForId(User user);

    List<User> findByIdAndUsernameIf(User user);

    List<User> findByIdAndUsernameChoose(User user);

    void updateIf(User user);

    List<User> findByList(List<Integer> ids);

    List<User> findByArray(int[] ids);

    List<User> findByPojo(QueryVo queryVo);

}
