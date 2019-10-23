package cn.bysjm.mapper;

import cn.bysjm.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Insert("INSERT INTO `user`(username,birthday,sex,address) VALUES(#{username},#{birthday},#{sex},#{address})")
    void save(User user);

    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id = #{id}")
    void update(User user);

    @Delete("delete from user where id = #{id}")
    void delete(int id);
}
