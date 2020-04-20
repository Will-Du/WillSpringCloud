package com.wcd.serviceorder.domain.order.dao;

import com.wcd.servicecommon.base.BaseDao;
import com.wcd.serviceorder.domain.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 订单dao
 * @author: Will
 * @date: 2020/4/20 22:16
 */
@Mapper
public interface OrderDao extends BaseDao<Order, String> {

}
