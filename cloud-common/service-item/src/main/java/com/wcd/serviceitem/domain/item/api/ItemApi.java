package com.wcd.serviceitem.domain.item.api;

import com.wcd.servicecommon.base.JsonModel;
import com.wcd.serviceitem.domain.item.entity.Item;
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
/**
 * @Description: 商品API
 *
 * @Author: Will
 * @Date: 2020/4/19  20:56
*/
@Api(tags = {"商品模块"}, produces = "application/json")
@RequestMapping("/item")
public interface ItemApi {

    @ApiOperation("查询所有")
    @PostMapping("/find")
    public JsonModel find(@RequestBody Item item);

    @ApiOperation("根据id查询")
    @PostMapping("/getById")
    public JsonModel getById(@RequestBody Item item);
}
