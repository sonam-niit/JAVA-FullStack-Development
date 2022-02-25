package com.simplilearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.PersonEntity;
import com.simplilearn.entity.Response;
import com.simplilearn.service.PersonService;

@RestController
@RequestMapping("/apione")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public ResponseEntity<PersonEntity> addPerson(@RequestBody PersonEntity entity)
	{
		PersonEntity data= personService.addPerson(entity);
		return new ResponseEntity<PersonEntity>(data,HttpStatus.CREATED);
	}
	
	@RequestMapping("/person/{personId}")
	public ResponseEntity<Response> getPersonDetails(@PathVariable int personId)
	{
		Response obj= personService.getPerson(personId);
		return new ResponseEntity<Response>(obj,HttpStatus.FOUND);
	}
}
