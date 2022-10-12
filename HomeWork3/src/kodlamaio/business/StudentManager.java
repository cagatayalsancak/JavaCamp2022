package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.StudentDao;
import kodlamaio.entities.Student;

public class StudentManager {
	private StudentDao studentDao;
	private Logger[] loggers;

	public StudentManager(StudentDao studentDao, Logger[] loggers) {
		this.studentDao = studentDao;
		this.loggers = loggers;
	}
	
	public void add(Student student) {
		studentDao.add(student);
		
		for (Logger logger : loggers) {
			logger.log(student.getFirstName());
		}
		
		
	}
}
