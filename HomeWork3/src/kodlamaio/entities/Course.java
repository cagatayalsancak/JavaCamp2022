package kodlamaio.entities;

public class Course {
	private int id;
	private String name;
	private double unitPrice;
	private Category category;
	private Instructor instructor;

	public Course() {

	}

	public Course(int id, String name, double unitPrice, Category category, Instructor instructor) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.category = category;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice; 
		
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor getInstructor() {
		return this.instructor;
	}

	public void setInstructors(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", category=" + category
				+ ", instructor=" + instructor + "]";
	}

	

}
