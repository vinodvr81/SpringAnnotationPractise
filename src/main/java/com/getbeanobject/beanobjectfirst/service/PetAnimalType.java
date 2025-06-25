package com.getbeanobject.beanobjectfirst.service;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import com.getbeanobject.beanobjectfirst.service.AnimalInterface;

//@Primary
@Component
public class PetAnimalType implements AnimalInterface{
	private String AnimalOriType;

	public PetAnimalType() {
		// TODO Auto-generated constructor stub
		this.AnimalOriType = "This is a Pet Animal";
	}
	
	public String AnimalTypeInPosession() {
		return this.AnimalOriType;
	}

}
