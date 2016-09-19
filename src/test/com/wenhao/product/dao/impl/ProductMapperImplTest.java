package com.wenhao.product.dao.impl;

import com.wenhao.product.dao.IProductMapper;
import com.wenhao.product.domain.Product;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class ProductMapperImplTest {
    IProductMapper dao = new ProductMapperImpl();

    @Test
    public void save() throws Exception {
        Product product = new Product();
        product.setProductname("wenhao");
        product.setProducttype("renwu");
        dao.save(product);
    }

    @Test
    public void delete() throws Exception {
        dao.delete(3L);
    }

    @Test
    public void update() throws Exception {
        Product product = new Product();
        product.setProductname("zzzzzzzzz");
        product.setProducttype("xxxxxxxxx");
        product.setId(9L);
        dao.update(product);
    }

    @Test
    public void get() throws Exception {
        Product product = dao.get(9L);
        System.out.println(product);
    }

    @Test
    public void getAll() throws Exception {
        List<Product> list = dao.getAll();
        for (Product p : list) {
            System.out.println(p);
        }
    }

}