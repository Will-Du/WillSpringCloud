package com.wcd.serviceorder.domain.order.api;

import com.wcd.servicecommon.base.JsonModel;
import com.wcd.serviceorder.domain.order.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 订单api
 * @author: Will
 * @date: 2020/4/20 22:58
 */
@Api(tags = {"订单模块"}, produces = "application/json")
@RequestMapping("/order")
public interface OrderApi {

    @ApiOperation("根据id查询")
    @PostMapping("/getById")
    public JsonModel getById(@RequestBody Order order);
}
