package kodlamaio.dataAccess.hibernate;

import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile Eklendi. " + course);
		
	}

}
