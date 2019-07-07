package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author Li Yan
 * 2019/7/7 20:01
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);
}
