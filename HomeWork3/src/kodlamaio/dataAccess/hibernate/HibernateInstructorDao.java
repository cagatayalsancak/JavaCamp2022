package kodlamaio.dataAccess.hibernate;

import kodlamaio.dataAccess.InstructorDao;
import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile Eklendi. " + instructor);
		
	}

}
