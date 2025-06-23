package com.getbeanobject.beanobjectfirst.controller;
import com.getbeanobject.beanobjectfirst.controller.ValueAnnotationExample;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AnnotationThroughSetterExample {
	private ValueAnnotationExample VAEx;
	@Autowired
	public void setAnnotationThroughSetterExample(ValueAnnotationExample VAEx) {
		// TODO Auto-generated constructor stub
		this.VAEx = VAEx;		
	}
	public String getAnnotationThroughSetterExample() {
		// TODO Auto-generated constructor stub
		return "This autowired using setter " + this.VAEx.getAutowiredThroughSetter();
	} 

}
