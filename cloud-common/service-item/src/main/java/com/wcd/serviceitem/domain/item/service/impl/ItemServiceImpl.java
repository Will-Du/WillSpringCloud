package com.wcd.serviceitem.domain.item.service.impl;

import com.wcd.serviceitem.domain.item.dao.ItemDao;
import com.wcd.serviceitem.domain.item.entity.Item;
import com.wcd.serviceitem.domain.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 商品实现类
 * @author: Will
 * @date: 2020/4/19 19:48
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> findAll() {
        return itemDao.find(new Item());
    }

    @Override
    public Item getById(String id) {
        return itemDao.getById(id);
    }
}
