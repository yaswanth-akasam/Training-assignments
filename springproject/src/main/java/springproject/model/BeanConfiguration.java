package springproject.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration  {
	
	@Bean("address1")
	public Address address1() {
		return new Address(10, "jyothi nagar", "bhopal");
	}

	/*
	 * @Bean("address2") public Address address2() { return new Address(10,
	 * "santhi nagar", "Hyderabad"); }
	 */
	@Bean
	public Employee createEmployee() {
		return new Employee(101, "yaswanth", "manager");
	}
	@Bean
	public Student createStudent() {
		return new Student(21, "nistish kumar ", "ECE");
	}
	
}
