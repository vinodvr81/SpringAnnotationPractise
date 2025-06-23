package com.getbeanobject.beanobjectfirst.controller;
import org.springframework.stereotype.Component;


@Component
public class ValueAnnotationExample {
	private String profession;

	
	public void setAutowiredThroughSetter(String profession) {
		// TODO Auto-generated constructor stub
		this.profession = profession;
	}
	
	public String getAutowiredThroughSetter() {
		// TODO Auto-generated constructor stub
		return "My profession is :" + this.profession;
	}

}
