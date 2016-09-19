package com.wenhao.product.domain;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class Product {
    private Long id;
    private String productname;
    private String producttype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                ", producttype='" + producttype + '\'' +
                '}';
    }
}
