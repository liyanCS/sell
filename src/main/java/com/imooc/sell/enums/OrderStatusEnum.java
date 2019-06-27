package com.imooc.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Li Yan
 * @date 2019/6/27 17:27
 */
@AllArgsConstructor
@Getter
public enum OrderStatusEnum {

    NEW(0, "新下单"),
    COMPLETED(1, "已完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String description;

}
