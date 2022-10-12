package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.UserDao;
import kodlamaio.entities.User;

public class UserManager {
	private UserDao userDao;
	private Logger[] loggers;

	public UserManager(UserDao userDao, Logger[] loggers) {
		super();
		this.userDao = userDao;
		this.loggers = loggers;
	}

	public void add(User user) {
		userDao.add(user);

		for (Logger logger : loggers) {
			logger.log(user.getEmail());
		}

	}

}
