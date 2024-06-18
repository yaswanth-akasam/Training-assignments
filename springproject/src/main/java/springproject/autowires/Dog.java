package springproject.autowires;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
@Primary
public class Dog implements Animal {

	@Override
	public String getType() {
		return "Dog is a mamal";
		
	}

	@Override
	public String getName() {
		return "Dog";
	}

}
