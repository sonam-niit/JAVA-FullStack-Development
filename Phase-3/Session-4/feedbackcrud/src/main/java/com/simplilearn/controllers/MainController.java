package com.simplilearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Feedback;
import com.simplilearn.entity.FeedbackRepo;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	private FeedbackRepo feedbackRepo;
	
	@PostMapping("/")
	public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback){
		try {
			Feedback f=feedbackRepo.save(feedback);
			return new ResponseEntity<>(f,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
