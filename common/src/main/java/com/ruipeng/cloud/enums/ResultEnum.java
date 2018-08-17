package com.ruipeng.cloud.enums;

import lombok.Getter;

/**
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误"),
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
