package kodlamaio.dataAccess.jdbc;

import kodlamaio.dataAccess.StudentDao;
import kodlamaio.entities.Student;

public class JdbcStudentDao implements StudentDao{

	@Override
	public void add(Student student) {
		System.out.println("Jdbc ile Eklendi. " + student);
		
	}

}
