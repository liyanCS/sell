package com.imooc.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Li Yan
 * @date 2019/6/27 17:30
 */
@AllArgsConstructor
@Getter
public enum PayStatusEnum {

    WAIT(0, "未支付，等待支付"),
    PAY(1, "已经支付，支付成功");

    private Integer code;

    private String description;

}
