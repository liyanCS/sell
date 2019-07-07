package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Li Yan
 * @date 2019/6/27 17:32
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    @Id
    private String detailId;
    private String orderId;
    private String productId;
    /**
     * '商品名称'
     */
    private String productName;
    /**
     * '单价'
     */
    private BigDecimal productPrice;
    /**
     * '购买的数量'
     */
    private Integer productQuantity;
    /**
     * '商品小图'
     */
    private String productIcon;
//    /**
//     * '创建时间'
//     */
//    private Date createTime;
//    /**
//     * '修改时间'
//     */
//    private Date updateTime;
}
