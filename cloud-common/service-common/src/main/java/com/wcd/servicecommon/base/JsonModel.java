package com.wcd.servicecommon.base;

import lombok.Data;

/**
 * @description: jsonmodel
 * @author: Will
 * @date: 2020/4/10 18:04
 */
@Data
public class JsonModel {

    private String code;
    private String message;
    private Object data;

    public JsonModel() {
        super();
        this.code = "900";
        this.message = "成功";
    }

    @Override
    public String toString() {
        return "JsonModel [code=" + code + ", message=" + message + ",data=" + data + "]";
    }

}
