package com.getbeanobject.beanobjectfirst.controller;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.getbeanobject.beanobjectfirst.service.InheritanceDetails;


@Component
public class QualifierController {
	
	private InheritanceDetails ids;
//	private GirlChild girlChild;
	
//	@Autowired
//	public QualifierController(@Qualifier("boyChild") InheritanceDetails ids) {
//		// TODO Auto-generated constructor stub
//		this.ids = ids;
//		
//	}
	
	@Autowired
	public QualifierController(@Qualifier("girlChild") InheritanceDetails ids) {
		// TODO Auto-generated constructor stub
		this.ids = ids;
	}
//	
	public String getQualifierController() {
		return this.ids.getInheritanceDetails();
	}

}
