package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 *
 * @author Li Yan
 * @date 2019/6/23 20:17
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 单价
     */
    private BigDecimal productPrice;
    /**
     * 库存
     */
    private Integer productStock;
    /**
     * 描述
     */
    private String productDescription;
    /**
     * 小图
     */
    private String productIcon;
    /**
     * 类目编号
     */
    private Integer categoryType;
    /**
     * 商品状态，默认0， 0正常，1下架
     */
    private Integer productStatus;

}
