package com.example.demo.dao;

import com.example.demo.bean.ProductEntity;

public interface ProductDao {

	public void createProduct(ProductEntity entity);

	public ProductEntity getProduct(Integer id);

}
