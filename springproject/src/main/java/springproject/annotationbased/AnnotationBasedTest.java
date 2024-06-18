package springproject.annotationbased;


import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedTest {

	public static void main(String[] args) {
		 try (AnnotationConfigApplicationContext context = new 
	    		 AnnotationConfigApplicationContext(AnnotationBasedConfiguration.class)) {
			Book b = (Book)context.getBean("b");
			 Customer c = (Customer)context.getBean("c");
			 System.out.println(b);
			 System.out.println(c);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	

}
