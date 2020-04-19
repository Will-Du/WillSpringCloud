package com.wcd.serviceitem.domain.item.service;

import com.wcd.serviceitem.domain.item.entity.Item;

import java.util.List;

/**
 * @description: 商品service
 * @author: Will
 * @date: 2020/4/19 19:46
 */
public interface ItemService {

    /**
     * @Description: 查询所有商品
     *
     * @Author: Will
     * @Date: 2020/4/19  19:47
     *
     * @param
     * @Return: java.util.List<com.wcd.serviceitem.domain.item.entity.Item>
     * @exception
    */
    public List<Item> findAll();

    /**
     * @Description: 根据id查询商品
     *
     * @Author: Will
     * @Date: 2020/4/19  19:48
     *
     * @param id
     * @Return: com.wcd.serviceitem.domain.item.entity.Item
     * @exception
    */
    public Item getById(String id);
}
