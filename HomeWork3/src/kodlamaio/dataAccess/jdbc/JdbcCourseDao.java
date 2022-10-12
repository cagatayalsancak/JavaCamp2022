package kodlamaio.dataAccess.jdbc;

import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile Eklendi. " + course);
		
	}

}
