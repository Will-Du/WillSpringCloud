package com.wcd.servicecommon.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description: 分页查询dto
 * @author: Will
 * @date: 2020/4/10 18:23
 */
@Data
@NoArgsConstructor
@ToString
@ApiModel(description="分页查询参数")
public class PageQueryDto {

    @ApiModelProperty(value="页数")
    private Integer page;
    @ApiModelProperty(value="每页行数")
    private Integer rows;
}
