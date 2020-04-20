package com.wcd.serviceorder.domain.order.entity;

import com.wcd.servicecommon.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

/**
 * @description: 订单明细
 * @author: Will
 * @date: 2020/4/20 22:11
 */
@Data
@ToString
public class OrderDetail extends BaseEntity {

    private String orderId;
    private String detailId;
    private String itemId;
    private Item item;
}
