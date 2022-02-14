package springhibintegration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private EProductDAO eproductDAO;
	
	public List<EProductEntity> getAllProducts() {
		return eproductDAO.getAllProducts();
	}

}
