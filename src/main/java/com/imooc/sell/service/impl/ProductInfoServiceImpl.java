package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.exception.SellException;
import com.imooc.sell.repository.ProductInfoRepository;
import com.imooc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.imooc.sell.enums.ResultEnum.PRODUCT_NOT_EXIST;
import static com.imooc.sell.enums.ResultEnum.PRODUCT_STOCK_ERROR;

/**
 * 商品
 *
 * @author Li Yan
 * @date 2019/6/23 23:23
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo findOne(String productId) {
        return productInfoRepository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }

    @Override
    @Transactional
    public void increaseStock(List<CartDTO> cartDTOList) {

        cartDTOList.forEach(e -> {
                    ProductInfo productInfo = productInfoRepository.findOne(e.getProductId());
                    if (productInfo == null) {
                        throw new SellException(PRODUCT_NOT_EXIST);
                    }
                    Integer result = productInfo.getProductStock() + e.getProductQuantity();
                    productInfo.setProductStock(result);
                    productInfoRepository.save(productInfo);
                }
        );
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {

        cartDTOList.forEach(e ->
        {
            ProductInfo productInfo = productInfoRepository.findOne(e.getProductId());
            if (productInfo == null) {
                throw new SellException(PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() - e.getProductQuantity();
            if (result < 0) {
                throw new SellException(PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            productInfoRepository.save(productInfo);
        });
    }
}
