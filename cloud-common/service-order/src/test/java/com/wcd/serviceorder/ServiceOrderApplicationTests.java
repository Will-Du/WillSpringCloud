package com.wcd.serviceorder;

import com.wcd.serviceorder.domain.order.dao.OrderDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceOrderApplicationTests {

    @Autowired
    private OrderDao orderDao;

    @Test
    void contextLoads() {
        orderDao.getById("1");
    }

}
