package cn.bysjm.test;

import cn.bysjm.domain.Order;
import cn.bysjm.mapper.OrderMapper;
import cn.bysjm.mapper.UserMapper;
import org.junit.Test;

import java.util.List;

public class OrderMapperTest extends BaseMapperTest {

    @Test
    public void testFindAllWithUser() throws Exception {
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.findAllWithUser();
        for (Order order : orderList) {
            System.err.println(order);
        }
    }

}
