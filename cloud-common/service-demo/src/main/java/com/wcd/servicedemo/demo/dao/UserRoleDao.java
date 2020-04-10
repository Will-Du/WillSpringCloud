package com.wcd.servicedemo.demo.dao;

import com.wcd.servicecommon.base.BaseDao;
import com.wcd.servicedemo.demo.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: UserRoleDao
 * @author: Will
 * @date: 2020/4/10 18:07
 */
@Mapper
public interface UserRoleDao extends BaseDao<UserRoleEntity, String> {

}
