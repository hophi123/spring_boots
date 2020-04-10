package com.example.demo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "product")
	@NamedQuery(name = "ProductEntity.findAll", query = "SELECT m FROM ProductEntity m")
public class ProductEntity implements Serializable{
	
	private static final long serialVersionUTD = 1l;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_type")
	private Integer productType;

	
	
	public ProductEntity() {
		super();
	}

	public ProductEntity(Integer productId, String productName, Integer productType) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
	}

	public Integer getProductId() {
		return id;
	}

	public void setProductId(Integer productId) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public static long getSerialversionutd() {
		return serialVersionUTD;
	}

	
	
}
