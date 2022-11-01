package OOPWithNLayeredApp.dataAccess.hibernate;

import OOPWithNLayeredApp.dataAccess.ProductDao;
import OOPWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	
	@Override
	public void add(Product product) {

		// Database erişim kodları yazılır. (SQL)
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
