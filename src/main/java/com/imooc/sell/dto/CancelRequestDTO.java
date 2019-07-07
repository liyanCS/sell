package com.imooc.sell.dto;

import lombok.Data;

/**
 * @author Li Yan
 * 2019/7/7 18:42
 */
@Data
public class CancelRequestDTO {

    private String openid;

    private String orderId;
}
