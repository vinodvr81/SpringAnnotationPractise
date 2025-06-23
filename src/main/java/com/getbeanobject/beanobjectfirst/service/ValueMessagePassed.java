package com.getbeanobject.beanobjectfirst.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ValueMessagePassed {
	private String message;

	@Value("${custom.message}")
	public void setValueMessagePassed(String message) {
		this.message = message;
	}

	public void printMessage() {
		System.out.println("Message: " + message);
	}
}
