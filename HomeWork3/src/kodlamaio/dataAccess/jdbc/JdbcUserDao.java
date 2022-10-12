package kodlamaio.dataAccess.jdbc;

import kodlamaio.dataAccess.UserDao;
import kodlamaio.entities.User;

public class JdbcUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Jdbc ile Eklendi. " + user);
		
	}

}
