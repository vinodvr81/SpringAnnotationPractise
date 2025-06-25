package com.getbeanobject.beanobjectfirst.service;

import org.springframework.stereotype.Component;

@Component
public class GirlChild implements InheritanceDetails{
	
	private String ChildType;

	public GirlChild() {
		// TODO Auto-generated constructor stub
		this.ChildType = "A Female Child ";
	}
	
	public String getInheritanceDetails() {
		return this.ChildType;
	}

}
