package kodlamaio.entities;

public class Student extends User {
	private String firstName;
	private String lastName;
	private String profilPhoto;
	private String Address;
	private String paymentCard;

	public Student() {

	}

	public Student(String firstName, String lastName, String profilPhoto, String address, String paymentCard) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profilPhoto = profilPhoto;
		Address = address;
		this.paymentCard = paymentCard;
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

	public String getProfilPhoto() {
		return profilPhoto;
	}

	public void setProfilPhoto(String profilPhoto) {
		this.profilPhoto = profilPhoto;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(String paymentCard) {
		this.paymentCard = paymentCard;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", profilPhoto=" + profilPhoto
				+ ", Address=" + Address + ", paymentCard=" + paymentCard + "]";
	}



	

}
