package com.imooc.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Li Yan
 * @date 2019/6/23 23:31
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

}
