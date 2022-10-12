package kodlamaio.dataAccess.hibernate;

import kodlamaio.dataAccess.UserDao;
import kodlamaio.entities.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile Eklendi. " + user);
		
	}

}
