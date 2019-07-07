package com.imooc.sell.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Li Yan
 * 2019/7/1 23:09
 */
@Data
public class QueryOrderDetailResponseDTO {

    private String orderId;
    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家电话
     */
    private String buyerPhone;
    /**
     * 买家地址
     */
    private String buyerAddress;
    /**
     * 买家微信openid
     */
    private String buyerOpenid;
    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;
    /**
     * 订单状态，默认0新下单
     */
    private Integer orderStatus;
    /**
     * 支付状态，默认0未支付
     */
    private Integer payStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    private List<Detail> orderDetailList;

    @Data
    public static class Detail {

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

    }

}
