package com.wcd.servicedemo.demo.service;

import com.wcd.servicecommon.base.PageModel;
import com.wcd.servicedemo.demo.dto.UserRoleQueryDto;
import com.wcd.servicedemo.demo.entity.UserRoleEntity;

/**
 * @description: UserRoleService
 * @author: Will
 * @date: 2020/4/10 18:09
 */
public interface UserRoleService {

    /**
     * 分页查询
     * @param queryDto
     * @return
     */
    public PageModel<UserRoleEntity> findByPage(UserRoleQueryDto queryDto);
}
