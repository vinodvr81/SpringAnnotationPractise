package com.getbeanobject.beanobjectfirst.controller;

import com.getbeanobject.beanobjectfirst.service.HelloVinod;
import com.getbeanobject.beanobjectfirst.service.beanDifferentObj;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AutowiredThroughConstructor {
	private HelloVinod HV;
	private beanDifferentObj bdfo;
	
	@Autowired
	public AutowiredThroughConstructor(HelloVinod HV, beanDifferentObj bdfo) {
		// TODO Auto-generated constructor stub
		this.bdfo = bdfo;
		this.HV = HV;
	}
	
	public String getAutowiredThroughConstructor() {
		return this.bdfo.beanDifferentObjnameCall()+ " " + this.HV.getHelloVinod();
	}

}
