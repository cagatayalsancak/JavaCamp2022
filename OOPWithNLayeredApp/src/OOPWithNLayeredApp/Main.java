package OOPWithNLayeredApp;

import OOPWithNLayeredApp.business.ProductManager;
import OOPWithNLayeredApp.core.logging.DatabaseLogger;
import OOPWithNLayeredApp.core.logging.FileLogger;
import OOPWithNLayeredApp.core.logging.Logger;
import OOPWithNLayeredApp.dataAccess.hibernate.HibernateProductDao;
import OOPWithNLayeredApp.dataAccess.jdbc.JdbcProductDao;
import OOPWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product = new Product(1, "Iphone 15", 30000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger()};

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);

		productManager.add(product);

	}

}
