package com.wcd.servicedemo.demo.entity;

import com.wcd.servicecommon.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @description: TODO
 * @author: Will
 * @date: 2020/4/10 18:05
 */
@Data
@NoArgsConstructor
@ToString
public class UserRoleEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String username;
    private String role;
    private String phone;
}
