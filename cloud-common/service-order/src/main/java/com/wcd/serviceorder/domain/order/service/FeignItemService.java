package com.wcd.serviceorder.domain.order.service;

import com.wcd.serviceorder.domain.order.entity.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @description: 通过feign调用item服务
 * @author: Will
 * @date: 2020/4/22 21:45
 */
@FeignClient(name = "service-item")
public interface FeignItemService {

    @PostMapping("/item/getById1")
    public Item getItemById(String id);
}
