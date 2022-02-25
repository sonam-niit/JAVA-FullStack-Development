package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.HobbyService;
import com.simplilearn.entity.HobbyEntity;

@RestController
@RequestMapping("/apitwo")
public class HobbyController {

	@Autowired
	private HobbyService hobbyService;
	
	@RequestMapping("/hobby/{personId}")
	public String findByPersonId(@PathVariable int personId)
	{
		return hobbyService.findByPersonId(personId);
	}
	@PostMapping("/hobby")
	public ResponseEntity<HobbyEntity> addHobby(@RequestBody HobbyEntity entity)
	{
		HobbyEntity e= hobbyService.addHobby(entity);
		return new ResponseEntity<HobbyEntity>(e,HttpStatus.CREATED);
	}
}
