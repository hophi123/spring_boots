package com.example.demo.service;

import com.example.demo.bean.ProductEntity;

public interface ProductService {

	public void createProduct(ProductEntity entity);

	public ProductEntity getProductEntityByid(int id);
}
