package com.getbeanobject.beanobjectfirst.controller;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.getbeanobject.beanobjectfirst.service.AnimalInterface;

@Component
public class PrimaryController {
	private AnimalInterface aif;
	
	public PrimaryController(AnimalInterface aif) {
		// TODO Auto-generated constructor stub
		this.aif = aif;		
	}
	public String getPrimaryController() {
		return this.aif.AnimalTypeInPosession();
	}

}
