package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	public List<Course> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		for (Course _course : courses) {
			if (_course.getName().toLowerCase() == course.getName().toLowerCase()) {
				throw new Exception("Bu kurs daha önce eklenmiş.");

			}
		}
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
