package OOPWithNLayeredApp.business;

import OOPWithNLayeredApp.core.logging.Logger;
import OOPWithNLayeredApp.dataAccess.ProductDao;
import OOPWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// İş Kuralları

		if (product.getUnitPrice() < 10) {
			throw new Exception("Fiyat 10'dan küçük olamaz.");

		}
		productDao.add(product);

		for (Logger logger : loggers) {
			logger.log(product.getName());

		}

		/*
		 * Not Clean Codes
		 * 
		 * JdbcProductDao jdbcProductDao = new JdbcProductDao(); HibernateProductDao
		 * hibernateProductDao = new HibernateProductDao();
		 * hibernateProductDao.add(product);
		 * 
		 */

	}

}
