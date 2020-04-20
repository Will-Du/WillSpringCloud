package com.wcd.serviceorder.domain.order.service;

import com.wcd.serviceorder.domain.order.entity.Item;
import com.wcd.serviceorder.domain.order.entity.Order;

/**
 * @description: 订单service
 * @author: Will
 * @date: 2020/4/20 22:54
 */
public interface OrderService {

    public Order getById(String id);
}
