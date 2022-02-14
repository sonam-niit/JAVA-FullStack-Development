package springhibintegration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EProductController {

	@Autowired
	ProductService eproductService;
	
	@RequestMapping(value = "/productList",method = RequestMethod.GET)
	public String listProducts(ModelMap map)
	{
		map.addAttribute("eproduct", new EProductEntity());
		map.addAttribute("productList",eproductService.getAllProducts());
		
		return "productList";
	}
}
