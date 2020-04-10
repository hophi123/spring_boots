package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> getProduct() {
		System.out.println("pppp");
		ProductEntity entity = null;
		try {
			entity = productService.getProductEntity();
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("System error", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>(entity.getProductName(), HttpStatus.OK);

	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> test() {
		try {
			System.out.println("pppp");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("System error", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("pppp", HttpStatus.OK);

	}

}
