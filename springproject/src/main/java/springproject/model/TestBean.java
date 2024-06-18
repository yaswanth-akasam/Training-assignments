package springproject.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee e = (Employee)context.getBean("employee");
		Address adr = (Address)context.getBean("address");
		Person p = (Person)context.getBean("person");
		Student st = (Student)context.getBean("student");
		System.out.println(e);
		System.out.println(adr);
		System.out.println(p);
		System.out.println(st);
	}
}
