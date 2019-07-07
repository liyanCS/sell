package com.imooc.sell.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Li Yan
 * 2019/7/2 14:52
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CartDTO {
    /**
     * 购买的商品ID
     */
    private String productId;

    /**
     * 购买的商品数量
     */
    private Integer productQuantity;
}
