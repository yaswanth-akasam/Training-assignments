package springproject.autowires;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
	@Autowired
	@Qualifier("dog")
	Animal a;
    public String getAnimalType() {
    	return a.getType();
    }
    public String getAnimalName() {
    	return a.getName();
    }
    
}
