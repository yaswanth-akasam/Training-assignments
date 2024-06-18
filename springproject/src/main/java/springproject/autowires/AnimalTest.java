package springproject.autowires;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalTest {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfiguration.class)) {
			AnimalService service = context.getBean(AnimalService.class);
			System.out.println(service.getAnimalName());
			System.out.println(service.getAnimalType());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
