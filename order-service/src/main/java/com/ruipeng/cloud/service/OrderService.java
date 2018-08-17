package com.ruipeng.cloud.service;


import com.ruipeng.cloud.vo.OrderDTO;

/**
 * 2017-12-10 16:39
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
