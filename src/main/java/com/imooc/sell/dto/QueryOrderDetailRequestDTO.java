package com.imooc.sell.dto;

import lombok.Data;

/**
 * @author Li Yan
 * 2019/7/1 23:08
 */
@Data
public class QueryOrderDetailRequestDTO {

    private String openid;

    private String orderId;
}
