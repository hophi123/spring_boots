package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.ProductEntity;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ProductEntity> getProduct() {
		ProductEntity entity = null;
		try {
			entity = productService.getProductEntity();
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ProductEntity>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ProductEntity>(entity, HttpStatus.OK);

	}
	

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ResponseEntity<String> createProduct(@RequestBody ProductEntity productEntity) {
		try {
			productService.createProduct(productEntity);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("System error", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Product is created", HttpStatus.OK);

	}
	
	@RequestMapping(value = "/product", method = RequestMethod.DELETE)
	public ResponseEntity<String> delProduct(@RequestBody ProductEntity productEntity) {
		try {
			productService.createProduct(productEntity);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("System error", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Product is created", HttpStatus.OK);

	}

}
