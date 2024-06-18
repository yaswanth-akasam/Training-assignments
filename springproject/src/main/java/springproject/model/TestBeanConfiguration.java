package springproject.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanConfiguration {

	public static void main(String[] args) {
	  AnnotationConfigApplicationContext context =
			  new AnnotationConfigApplicationContext(BeanConfiguration.class);
	  Address a  = (Address)context.getBean("address1");
	  System.out.println(a.getCity());
	  context.close();
	}

}
