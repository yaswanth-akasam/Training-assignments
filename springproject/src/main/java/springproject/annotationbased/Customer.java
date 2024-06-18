package springproject.annotationbased;

import org.springframework.stereotype.Component;

@Component("c")
public class Customer {
	
	String name;
	int age;
	String city;
	String product;

	public Customer() {
		name = "yaswanth";
		age = 23;
		city = "Bhagalpur";
		product = " Refrigerator.";
		
	}

	public Customer(String name, int age, String city, String product) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.product = product;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getProduct() {
		return product;
	}



	public void setProduct(String product) {
		this.product = product;
	}
	



	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", city=" + city + ", product=" + product + "]";
	}




}
