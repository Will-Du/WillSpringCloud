package com.wcd.serviceorder.domain.order.entity;

import com.wcd.servicecommon.base.BaseEntity;
import lombok.Data;
import lombok.ToString;

/**
 * @description: 商品类
 * @author: Will
 * @date: 2020/4/19 19:26
 */
@Data
@ToString
public class Item extends BaseEntity {

    private String id;
    private String title;
    private String pic;
    private String description;
    private Double price;
}
