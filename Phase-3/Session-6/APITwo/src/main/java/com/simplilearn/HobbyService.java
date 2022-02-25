package com.simplilearn;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.HobbyEntity;
import com.simplilearn.repository.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	private HobbyRepository hobbyRepository;
	
	public HobbyEntity addHobby(HobbyEntity entity)
	{
		return hobbyRepository.save(entity);
	}
	
	public String findByPersonId(int personId)
	{
		return hobbyRepository.findByPersonId(personId);
	}
}
