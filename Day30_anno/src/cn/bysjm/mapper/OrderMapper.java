package cn.bysjm.mapper;

import cn.bysjm.domain.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> findAllWithUser();

    List<Order> findByUid(Integer uid);

}
