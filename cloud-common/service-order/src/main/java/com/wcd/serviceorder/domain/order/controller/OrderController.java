package com.wcd.serviceorder.domain.order.controller;

import com.wcd.servicecommon.base.JsonModel;
import com.wcd.serviceorder.domain.order.api.OrderApi;
import com.wcd.serviceorder.domain.order.entity.Order;
import com.wcd.serviceorder.domain.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 订单controller
 * @author: Will
 * @date: 2020/4/20 22:59
 */
@RestController
public class OrderController implements OrderApi {

    @Autowired
    private OrderService orderService;

    @Override
    public JsonModel getById(Order order) {

        JsonModel jsonModel = new JsonModel();
        jsonModel.setData(orderService.getById(order.getOrderId()));

        return jsonModel;
    }
}
