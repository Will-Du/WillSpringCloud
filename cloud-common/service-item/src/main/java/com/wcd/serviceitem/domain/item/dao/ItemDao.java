package com.wcd.serviceitem.domain.item.dao;

import com.wcd.servicecommon.base.BaseDao;
import com.wcd.serviceitem.domain.item.entity.Item;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 商品dao
 * @author: Will
 * @date: 2020/4/19 19:38
 */
@Mapper
public interface ItemDao extends BaseDao<Item, String> {
}
