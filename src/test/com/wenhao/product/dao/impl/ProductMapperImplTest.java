package com.wenhao.product.dao.impl;

import com.wenhao.product.dao.IProductMapper;
import com.wenhao.product.domain.Product;
import com.wenhao.product.query.ProductQuery;
import org.junit.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class ProductMapperImplTest {

    IProductMapper dao = new ProductMapperImpl();

    @Test
    public void getAlls() throws Exception {
        ProductQuery query = new ProductQuery();
        Product product = dao.getAlls(query);
        System.out.println(product);
    }

    @Test
    public void save() throws Exception {
        Product product = new Product();
        product.setName("wenhao");
        product.setProducttype("renwu");
        dao.save(product);
    }

    @Test
    public void delete() throws Exception {
        dao.delete(14L);
    }

    @Test
    public void update() throws Exception {
        Product product = new Product();
        product.setName("zzzzzzzzz");
        product.setProducttype("xxxxxxxxx");
        product.setId(10L);
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