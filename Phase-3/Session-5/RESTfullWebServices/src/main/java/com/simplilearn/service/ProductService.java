package com.simplilearn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.ProductEntity;
import com.simplilearn.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;
	
	public List<ProductEntity> getAllProduct()
	{
		return productRepo.findAll();
	}
	public ProductEntity getProductById(int id)
	{
		return productRepo.findById(id).get();
	}
	public void addProduct(ProductEntity object)
	{
		productRepo.save(object);
	}
	public void updateProduct(int id,ProductEntity entity)
	{
		if(productRepo.findById(id).isPresent())
		{
			ProductEntity old= productRepo.findById(id).get();
			old.setName(entity.getName());
			old.setDescription(entity.getDescription());
			productRepo.save(old);
			
		}
	}
	public void deleteProduct(int id)
	{
		productRepo.deleteById(id);
	}
}
