package kodlamaio.dataAccess.hibernate;

import kodlamaio.dataAccess.StudentDao;
import kodlamaio.entities.Student;

public class HibernateStudentDao implements StudentDao {

	@Override
	public void add(Student student) {
		System.out.println("Hibernate ile Eklendi. " + student);
		
	}

}
