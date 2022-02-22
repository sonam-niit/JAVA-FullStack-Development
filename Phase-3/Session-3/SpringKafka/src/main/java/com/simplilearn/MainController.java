package com.simplilearn;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@RequestMapping(value = "/")
	public String index()
	{
		sendMessage("Message sent "+Calendar.getInstance().getTime());
		return "Check Console";
	}
	
	private void sendMessage(String msg)
	{
		kafkaTemplate.send("ecommerce",msg);
	}
}
