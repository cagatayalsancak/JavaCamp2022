package kodlamaio.entities;

public class Instructor extends User {
	private String firstName;
	private String lastName;
	private String about;
	private String job;

	public Instructor() {

	}

	public Instructor(String firstName, String lastName, String about, String job) {
		this.about = about;
		this.job = job;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", about=" + about + ", job=" + job
				+ "]";
	}

	

	

}
