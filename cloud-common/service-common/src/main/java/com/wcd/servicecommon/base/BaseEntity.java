package com.wcd.servicecommon.base;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @description: 基础entity
 * @author: Will
 * @date: 2020/4/10 17:59
 */
@Data
@NoArgsConstructor
@ToString
public class BaseEntity {

    /** 主键ID **/
    private String id;
    /** 创建人id **/
    private String createdUser;
    /** 创建时间 **/
    private Date createdDate;
    /** 更新人 **/
    private String updateUser;
    /** 更新时间 **/
    private Date updateDate;
}
