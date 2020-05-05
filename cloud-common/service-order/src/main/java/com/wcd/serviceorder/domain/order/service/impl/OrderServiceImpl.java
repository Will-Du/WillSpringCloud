package com.wcd.serviceorder.domain.order.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wcd.serviceorder.domain.order.dao.OrderDao;
import com.wcd.serviceorder.domain.order.entity.Item;
import com.wcd.serviceorder.domain.order.entity.Order;
import com.wcd.serviceorder.domain.order.entity.OrderDetail;
import com.wcd.serviceorder.domain.order.service.FeignItemService;
import com.wcd.serviceorder.domain.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 订单实现类
 * @author: Will
 * @date: 2020/4/20 22:55
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FeignItemService feignItemService;

    @Override
    public Order getById(String id) {

        Order order = orderDao.getById(id);

        if(!CollectionUtils.isEmpty(order.getOrderDetails())) {
            for (OrderDetail detail: order.getOrderDetails()) {
//                Item item = queryItemById(detail.getItemId());
                Item item = queryItemById2(detail.getItemId());
                if(item != null) {
                    detail.setItem(item);
                }
            }
        }

        return order;
    }

    @HystrixCommand(fallbackMethod = "queryItemById2FallbackMethod")
    private Item queryItemById(String id) {

        return this.restTemplate.postForObject("http://service-item/item/getById1",id, Item.class);
    }

    @HystrixCommand(fallbackMethod = "queryItemById2FallbackMethod")
    private Item queryItemById2(String id) {

        Item item = feignItemService.getItemById(id);
        System.out.println("===========HystrixCommand queryItemById-线程池名称：" + Thread.currentThread().getName() + "订单系统调用商品服务,item:" + item);
        return item;
    }

    private Item queryItemById2FallbackMethod(String id) {
        System.err.println("====");
        return new Item();
    }
}
