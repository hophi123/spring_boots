package com.example.demo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.ProductEntity;
import com.example.demo.dao.ProductDao;
import com.example.demo.dao.daoimpl.ProductDaoImpl;
import com.example.demo.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public void createProduct(ProductEntity entity) {
		productDao.createProduct(entity);
	}

	@Override
	public ProductEntity getProductEntityByid(int id) {
		ProductEntity entity = new ProductEntity();
		entity = productDao.getProduct(id);
		return entity;
	}
	


}
