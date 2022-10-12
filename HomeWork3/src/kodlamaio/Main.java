package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.InstructorManager;
import kodlamaio.business.StudentManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaio.dataAccess.hibernate.HibernateCourseDao;
import kodlamaio.dataAccess.hibernate.HibernateInstructorDao;
import kodlamaio.dataAccess.hibernate.HibernateStudentDao;
import kodlamaio.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaio.dataAccess.jdbc.JdbcCourseDao;
import kodlamaio.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaio.dataAccess.jdbc.JdbcStudentDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;
import kodlamaio.entities.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Web Geliştirme");
		Category category3 = new Category(3, "Programlama");
		Category[] categories = {category1, category2, category3};
	
		CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers);		
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
	
		
		
		for(Category _category : categories) {
			categoryManager1.add(_category);
			categoryManager2.add(_category);
			System.out.println("---------------------------------------------------------------");
		}
		
		Instructor instructor1 = new Instructor("Engin", "Demirog", "MCT, PMP, ITIL", "Yazılımcı");
		Instructor instructor2 = new Instructor("Murat", "Kurtbogan", "asdsadsadsd", "Yazılımcı");
		Instructor instructor3 = new Instructor("Kerem", "Varışlı", "asdşlkasdlşkaskd", "Yazılımcı");
		Instructor instructor4 = new Instructor("Yaşar", "Taymaz", "dfsfsdfdsfsdf", "Öğrenci İşleri Müdürü");
		Instructor[] instructors = {instructor1, instructor2, instructor3, instructor4};
		

		InstructorManager instructorManager1 = new InstructorManager(new HibernateInstructorDao(), loggers);
		InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(), loggers);
		
		for(Instructor _instructor : instructors) {
			int i = 1;
			_instructor.setId(i);
			instructorManager1.add(_instructor);
			instructorManager2.add(_instructor);
			i++;
			System.out.println("---------------------------------------------------------------");
		}
		
		Student student1 = new Student("Mehmet Çağatay", "ALSANCAK", "profile.jpg", "asdsadsad", "dslşfkdsşlfkldsşf");
		Student[] students = {student1};
		StudentManager studentManager1 = new StudentManager(new HibernateStudentDao(), loggers);		
		StudentManager studentManager2 = new StudentManager(new JdbcStudentDao(), loggers);
		
		for(Student _student : students) {
			int i = 1;
			_student.setId(i);
			studentManager1.add(_student);
			studentManager2.add(_student);
			i++;
			System.out.println("---------------------------------------------------------------");
		}
		
		Course course1 = new Course(1, "Java Programlama", 2000, category1, instructor1);
		Course course2 = new Course(2, "C# Programlama", 5000, category1, instructor1);
		Course course3 = new Course(3, "React ile Web Geliştirme", -5, category2, instructor3);
		Course course4 = new Course(4, "Java Programlama", 10000, category3, instructor2);
		Course[] courses = {course1, course2, course3, course4};
		
		CourseManager courseManager1 = new CourseManager(new HibernateCourseDao(), loggers);
		CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(), loggers);
		for(Course _course : courses) {
			courseManager1.add(_course);
			courseManager2.add(_course);
			System.out.println("---------------------------------------------------------------");
		}
		

	}

}
