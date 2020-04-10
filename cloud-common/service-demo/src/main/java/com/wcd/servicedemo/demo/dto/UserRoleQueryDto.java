package com.wcd.servicedemo.demo.dto;

import com.wcd.servicecommon.base.PageQueryDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description: 用户角色查询dto
 * @author: Will
 * @date: 2020/4/10 18:17
 */
@Data
@NoArgsConstructor
@ToString
@ApiModel(description="用户角色查询参数")
public class UserRoleQueryDto extends PageQueryDto {

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "角色名称")
    private String role;
}
