package com.getbeanobject.beanobjectfirst.service;

import org.springframework.stereotype.Component;

@Component
public class HelloVinod {

	private String WelcomeMsg;
	public HelloVinod() {
		// TODO Auto-generated constructor stub
		this.WelcomeMsg = "Hello Vinod Rangaswamy Vukkalam! Welcome to Maven project";
	}
	public String getHelloVinod() {
		return this.WelcomeMsg;
	}

}
