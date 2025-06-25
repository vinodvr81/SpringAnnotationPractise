package com.getbeanobject.beanobjectfirst.service;

import org.springframework.stereotype.Component;

@Component
public class BoyChild implements InheritanceDetails {
	private String ChildType;

	public BoyChild() {
		// TODO Auto-generated constructor stub
		this.ChildType = "A Male Child ";
	}
	
	public String getInheritanceDetails() {
		return this.ChildType;
	}

}
