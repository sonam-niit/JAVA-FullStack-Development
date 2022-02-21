package com.simplilearn.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.simplilearn.exception.ProductNotFoundException;

@ControllerAdvice
public class EProductExceptionController {

	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception) {
		return new ResponseEntity<Object>("Product Not Found",HttpStatus.CONFLICT);
	}
}
