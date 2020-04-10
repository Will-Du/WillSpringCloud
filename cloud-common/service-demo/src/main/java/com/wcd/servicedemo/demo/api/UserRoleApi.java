package com.wcd.servicedemo.demo.api;

import com.wcd.servicecommon.base.JsonModel;
import com.wcd.servicedemo.demo.dto.UserRoleQueryDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 用户角色模块
 * @author: Will
 * @date: 2020/4/10 18:10
 */
@Api(tags = {"用户角色模块"}, produces = "application/json")
@RequestMapping("/userRole")
public interface UserRoleApi {

    @ApiOperation("分页查询")
    @PostMapping("/findByPage")
    public JsonModel findByPage(@RequestBody UserRoleQueryDto queryDto);
}
