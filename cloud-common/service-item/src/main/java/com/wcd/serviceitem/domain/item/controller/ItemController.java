package com.wcd.serviceitem.domain.item.controller;

import com.wcd.servicecommon.base.JsonModel;
import com.wcd.serviceitem.domain.item.api.ItemApi;
import com.wcd.serviceitem.domain.item.entity.Item;
import com.wcd.serviceitem.domain.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 商品controller
 * @author: Will
 * @date: 2020/4/19 21:04
 */
@RestController
public class ItemController implements ItemApi {

    @Autowired
    private ItemService itemService;

    @Override
    public JsonModel find(Item item) {

        JsonModel jsonModel = new JsonModel();
        jsonModel.setData(itemService.findAll());

        return jsonModel;
    }

    @Override
    public JsonModel getById(String id) {

        JsonModel jsonModel = new JsonModel();
        jsonModel.setData(itemService.getById(id));

        return jsonModel;
    }
}
