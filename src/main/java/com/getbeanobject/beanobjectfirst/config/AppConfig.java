package com.getbeanobject.beanobjectfirst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.getbeanobject.beanobjectfirst.service.VehicleGeneral;
import com.getbeanobject.beanobjectfirst.service.BikeBajaj;
import com.getbeanobject.beanobjectfirst.service.CarMahindra;

@Configuration
public class AppConfig {
	@Bean
	public VehicleGeneral bikeBajaj() {
		// TODO Auto-generated constructor stub
		return new BikeBajaj();
	}
	@Bean
	public VehicleGeneral carMahindra() {
		return new CarMahindra();
	}

}
