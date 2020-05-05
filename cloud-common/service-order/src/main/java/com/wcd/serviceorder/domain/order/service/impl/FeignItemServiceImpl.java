package com.wcd.serviceorder.domain.order.service.impl;

import com.wcd.serviceorder.domain.order.entity.Item;
import com.wcd.serviceorder.domain.order.service.FeignItemService;
import org.springframework.stereotype.Component;

/**
 * @description: item服务失败的回调方法实现类
 * @author: Will
 * @date: 2020/4/25 15:17
 */
@Component
public class FeignItemServiceImpl implements FeignItemService {
    @Override
    public Item getItemById(String id) {
        return new Item();
    }
}
