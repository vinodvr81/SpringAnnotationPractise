package com.getbeanobject.beanobjectfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AutowiredThroughField {

	public AutowiredThroughField() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private ValueAnnotationExample VAEx;
	
	public void setAutowiredThroughField(ValueAnnotationExample VAEx) {
		// TODO Auto-generated constructor stub
		this.VAEx = VAEx;		
	}
	public String getAutowiredThroughField() {
		// TODO Auto-generated constructor stub
		return "This autowired using field " + this.VAEx.getAutowiredThroughSetter();
	} 

}
