package com.wxf.dao;

import com.wxf.entity.Product;

public interface ProductDao {
    /**
     * 主键回填
     * @param product
     * @return
     */
    Integer insertProduct(Product product);
}
