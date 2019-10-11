package cn.bysim.entity;

import cn.bysim.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserEntity {
    public List<User> findAll(){
        List<User> list = new ArrayList<>();
        list.add(new User("admin1","12345"));
        list.add(new User("admin2","12345"));
        list.add(new User("admin3","12345"));
        list.add(new User("admin4","12345"));
        list.add(new User("admin5","12345"));
        list.add(new User("admin6","12345"));
        return list;
    }
}
