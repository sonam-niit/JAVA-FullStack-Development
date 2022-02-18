package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Controller
public class MainController {

	@Autowired
	private EProductDAO eproductDAO;
	
	@RequestMapping(value = "/fetch",method = RequestMethod.GET)
	public String listProduct(ModelMap map)
	{
		List<EProductEntity> list= eproductDAO.getProducts();
		map.addAttribute("result",list);
		return "list";
	}
}
