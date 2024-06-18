package springproject.autowires;

import org.springframework.stereotype.Component;

@Component("parrot")
public class Parrot implements Animal {

	@Override
	public String getType() {
		return "Parrot is a bird";
		
	}

	@Override
	public String getName() {
       return "Parrot";
		
	}

}
