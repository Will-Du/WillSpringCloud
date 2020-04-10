package com.wcd.servicedemo.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.wcd.servicecommon.base.PageModel;
import com.wcd.servicedemo.demo.dao.UserRoleDao;
import com.wcd.servicedemo.demo.dto.UserRoleQueryDto;
import com.wcd.servicedemo.demo.entity.UserRoleEntity;
import com.wcd.servicedemo.demo.service.UserRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: Will
 * @date: 2020/4/10 18:09
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public PageModel<UserRoleEntity> findByPage(UserRoleQueryDto queryDto) {

        PageModel<UserRoleEntity> page = new PageModel<UserRoleEntity>(queryDto.getPage(),
                queryDto.getRows());
        PageHelper.offsetPage(page.getStart(), page.getRows());
        PageHelper.orderBy("id");

        UserRoleEntity userRoleEntity = new UserRoleEntity();
        BeanUtils.copyProperties(queryDto, userRoleEntity);

        page.initData(userRoleDao.findByPage(userRoleEntity));

        return page;
    }
}
