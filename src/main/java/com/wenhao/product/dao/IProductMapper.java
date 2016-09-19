package com.wenhao.product.dao;

import com.wenhao.product.domain.Product;

import java.util.List;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public interface IProductMapper {
    void save(Product product);

    void delete(Long id);

    void update(Product product);

    Product get(Long id);

    List<Product> getAll();
}
