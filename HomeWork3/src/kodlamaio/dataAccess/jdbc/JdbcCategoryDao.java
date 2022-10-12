package kodlamaio.dataAccess.jdbc;

import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile Eklendi. " + category);
		
	}

}
