package com.wcd.serviceorder.domain.order.entity;

import com.wcd.servicecommon.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @description: 订单实体类
 * @author: Will
 * @date: 2020/4/19 19:22
 */
@Data
@ToString
public class Order extends BaseEntity {

    private String orderId;
    private String userId;
    private List<OrderDetail> orderDetails;
}
