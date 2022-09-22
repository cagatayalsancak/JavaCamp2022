package oop1;

// Class isimlendirmeleri PascalCase yazılır. 
public class Main {

	public static void main(String[] args) {
		System.out.println("Object Oriented Programming - Obje Odaklı Programlama");

		
		Product product1 = new Product();
		
		/* Private Field */
		product1.setName("Filtre Kahve Makinesi");
		product1.setDiscount(20);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(15);
		product1.setImageUrl("kahvemakinesi.jpg");
		
		/* Public Field
		product1.name = "Filtre Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 20;
		product1.unitsInStock = 15;
		product1.imageUrl = "kahvemakinesi.jpg";*/
		
		
		
		
		Product product2 = new Product();
		
		/* Private Field */
		product2.setName("Espresso Kahve Makinesi");
		product2.setDiscount(25);
		product2.setUnitPrice(5500);
		product2.setUnitsInStock(12);
		product2.setImageUrl("espresso.jpg");
		
		
		/* Public Field
		product2.name = "Espresso Kahve Makinesi";
		product2.unitPrice = 5500;
		product2.discount = 25;
		product2.unitsInStock = 12;
		product2.imageUrl = "espresso.jpg"; */
		
		
		
		
		Product product3 = new Product();
		
		/* Private Field */
		product3.setName("Cappuccino Makinesi");
		product3.setDiscount(15);
		product3.setUnitPrice(3850);
		product3.setUnitsInStock(10);
		product3.setImageUrl("cappuccino.jpg");
		
		
		
		/* Public Field
		product3.name = "Cappuccino Makinesi";
		product3.unitPrice = 3850;
		product3.discount = 15;
		product3.unitsInStock = 10;
		product3.imageUrl = "cappuccino.jpg";
		*/
		
		Product[] products = {product1, product2, product3};
		
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		
		// Müşteriler
		// Bireysel Müşteri
		IndividualCustomer customer1 = new IndividualCustomer();
		customer1.setId(1);
		customer1.setFirstName("Mehmet Çağatay");
		customer1.setLastName("ALSANCAK");
		customer1.setPhoneNumber("+905555555555");
		customer1.setCustomerNumber("362143242");
	
		// Kurumsal Müşteriler
		CorporateCustomer customer2 = new CorporateCustomer();		
		customer2.setId(2);
		customer2.setCompanyName("MCA Bilişim");
		customer2.setCustomerNumber("9896564216");
		customer2.setPhoneNumber("+903125555555");
		customer2.setTaxNumber("5675412");
		
		Customer[] customers = {customer1, customer2};
		System.out.println("----------------------------------------------");
		System.out.println("<ul>");
		for (Customer customer : customers) {
			System.out.println("<li>" + customer.getCustomerNumber() + "</li>");
			
		}
		System.out.println("</ul>");
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
