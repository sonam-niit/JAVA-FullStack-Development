package springhibintegration;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EProductDAO {

	@Autowired
	private SessionFactory sessoFactory;
	
	public List<EProductEntity> getAllProducts(){
		return this.sessoFactory.getCurrentSession().createQuery("from EProductEntity").list();
	}
}
