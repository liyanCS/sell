package com.imooc.sell.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 商品类别表实体对象
 *
 * @author Li Yan
 * @date 2019/6/20 19:09
 */
@Entity
@DynamicUpdate
@Data
@NoArgsConstructor
public class ProductCategory {
    /**
     * 商品类别ID
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 商品类别名称
     */
    private String categoryName;

    /**
     * 商品类别编号
     */
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
