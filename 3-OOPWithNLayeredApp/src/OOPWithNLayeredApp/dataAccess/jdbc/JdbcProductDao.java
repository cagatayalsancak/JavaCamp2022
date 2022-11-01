package OOPWithNLayeredApp.dataAccess.jdbc;

import OOPWithNLayeredApp.dataAccess.ProductDao;
import OOPWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	
	@Override
	public void add(Product product) {

		// Database erişim kodları yazılır. (SQL)
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}
