package com.simplilearn.test;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

	private long id;
	private String name;
	private BigDecimal price;
	private ProductParts parts;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, BigDecimal price, ProductParts parts) {
		this.name = name;
		this.price = price;
		this.parts = parts;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public ProductParts getParts() {
		return parts;
	}

	public void setParts(ProductParts parts) {
		this.parts = parts;
	}
	
}
