package com.wcd.servicedemo.demo.controller;

import com.wcd.servicecommon.base.JsonModel;
import com.wcd.servicecommon.base.PageModel;
import com.wcd.servicedemo.demo.api.UserRoleApi;
import com.wcd.servicedemo.demo.dto.UserRoleQueryDto;
import com.wcd.servicedemo.demo.entity.UserRoleEntity;
import com.wcd.servicedemo.demo.service.UserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: UserRoleControler
 * @author: Will
 * @date: 2020/4/10 18:11
 */
@RestController
public class UserRoleController implements UserRoleApi {

    @Autowired
    private UserRoleService userRoleService;

    private static Logger log = LoggerFactory.getLogger(UserRoleController.class);

    @Override
    public JsonModel findByPage(UserRoleQueryDto queryDto) {

        JsonModel json = new JsonModel();
        PageModel<UserRoleEntity> page = userRoleService.findByPage(queryDto);
        json.setData(page);
        return json;
    }
}
