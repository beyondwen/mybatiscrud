package com.wenhao.product.domain;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class Product {
    private Long id;
    private String name;
    private String producttype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getWenHao() {
        return " where id = 10 ";
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producttype='" + producttype + '\'' +
                '}';
    }
}
