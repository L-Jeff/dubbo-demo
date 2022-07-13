package cn.itcast.order.service.impl;

import cn.itcast.dubbo.domain.Order;
import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        return orderMapper.findById(orderId);
    }
}
