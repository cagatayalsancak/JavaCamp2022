package kodlamaio.dataAccess.hibernate;

import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile Eklendi. " + category);
		
	}

}
