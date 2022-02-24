package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.ProductEntity;
import com.simplilearn.service.ProductService;

@RestController
@RequestMapping(path="/myapi")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<ProductEntity> getAll()
	{
		return productService.getAllProduct();
	}
	@GetMapping("/products/{id}")
	public ProductEntity getProById(@PathVariable("id") int id)
	{
		return productService.getProductById(id);
	}
	@PostMapping("/products")
	public void addNewProduct(@RequestBody ProductEntity object)
	{
		productService.addProduct(object);
	}
	@PutMapping("/products/{id}")
	public void updateProduct(@PathVariable("id")int id,@RequestBody ProductEntity entity)
	{
		productService.updateProduct(id, entity);
	}
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable("id")int id)
	{
		productService.deleteProduct(id);
	}
}
