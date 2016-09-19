package com.wenhao.product.dao.impl;

import com.wenhao.product.dao.IProductMapper;
import com.wenhao.product.domain.Product;
import com.wenhao.product.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2016/9/19 0019.
 */
public class ProductMapperImpl implements IProductMapper {
    SqlSession sqlSession = MybatisUtil.getSession();

    public void save(Product product) {
        sqlSession.insert("com.wenhao.product.dao.IProductMapper.save", product);
        sqlSession.close();
    }

    public void delete(Long id) {
        sqlSession.delete("com.wenhao.product.dao.IProductMapper.delete", id);
        sqlSession.close();
    }

    public void update(Product product) {
        sqlSession.update("com.wenhao.product.dao.IProductMapper.update", product);
        sqlSession.close();
    }

    public Product get(Long id) {
        Product product = sqlSession.selectOne("com.wenhao.product.dao.IProductMapper.get", id);
        return product;
    }

    public List<Product> getAll() {
        List<Product> list = sqlSession.selectList("com.wenhao.product.dao.IProductMapper.getAll");
        return list;
    }
}
