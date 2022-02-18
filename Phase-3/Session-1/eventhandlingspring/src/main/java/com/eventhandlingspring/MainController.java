package com.eventhandlingspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@Autowired
	CustomEventPublisher cep;
	
	@RequestMapping(value = "/customEvent",method = RequestMethod.GET)
	public String customEvent(ModelMap map)
	{
		cep.publish();
		cep.publish();
		cep.publish();
		return "customEvent";
	}
	
	@RequestMapping(value = "/readyEvent",method = RequestMethod.GET)
	public String readyEvent(ModelMap map)
	{
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("main-servlet.xml");
		context.start();
		context.stop();
		return "readyEvent";
	}
	
	
}
