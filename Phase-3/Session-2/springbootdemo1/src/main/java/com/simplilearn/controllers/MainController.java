package com.simplilearn.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.exception.ProductNotFoundException;

@RestController
public class MainController {

	@GetMapping(value = "/test")
	public ResponseEntity<Object> getTest()
	{
		return new ResponseEntity<Object>("Product Found",HttpStatus.OK);
	}
	
	@GetMapping(value = "/product/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable("id") String id)
	{
		System.out.println("Id: "+id);
		if(id.contentEquals("0"))
		{	
			throw new ProductNotFoundException();
		}
		else
		{
			return new ResponseEntity<Object>("Product Found",HttpStatus.OK);
		}
	}
}
