package com.getbeanobject.beanobjectfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.getbeanobject.beanobjectfirst.service.ValueMessagePassed;
import com.getbeanobject.beanobjectfirst.service.HelloVinod;
import com.getbeanobject.beanobjectfirst.service.beanDifferentObj;
import com.getbeanobject.beanobjectfirst.controller.AutowiredThroughConstructor;
import com.getbeanobject.beanobjectfirst.controller.ValueAnnotationExample;
import com.getbeanobject.beanobjectfirst.controller.AnnotationThroughSetterExample;
import com.getbeanobject.beanobjectfirst.controller.AutowiredThroughField;
import com.getbeanobject.beanobjectfirst.controller.QualifierController;
import com.getbeanobject.beanobjectfirst.controller.PrimaryController;
import com.getbeanobject.beanobjectfirst.config.AppConfig;
import com.getbeanobject.beanobjectfirst.service.CarMahindra;
import com.getbeanobject.beanobjectfirst.service.BikeBajaj;


@SpringBootApplication
public class BeanobjectfirstApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(BeanobjectfirstApplication.class, args);
		HelloVinod obj = context.getBean(HelloVinod.class);
		System.out.println(obj.HelloVinod());

		beanDifferentObj diffBeanskanda = (beanDifferentObj) context.getBean("Skanda");
		System.out.println(diffBeanskanda.beanDifferentObjnameCall());

		AutowiredThroughConstructor autowireEx = context.getBean(AutowiredThroughConstructor.class);
		System.out.println(autowireEx.getAutowiredThroughConstructor());

		ValueAnnotationExample ats = context.getBean(ValueAnnotationExample.class);
		ats.setAutowiredThroughSetter("This is coming Soon and I promise");
		System.out.println(ats.getAutowiredThroughSetter());

		ValueMessagePassed vms = context.getBean(ValueMessagePassed.class);
		vms.printMessage();
		
		AnnotationThroughSetterExample atsp = context.getBean(AnnotationThroughSetterExample.class);
		System.out.println(atsp.getAnnotationThroughSetterExample());
		
		AutowiredThroughField atfd = context.getBean(AutowiredThroughField.class);
		System.out.println(atfd.getAutowiredThroughField());
		
		QualifierController qcr = context.getBean(QualifierController.class);
		System.out.println(qcr.getQualifierController());
		
		PrimaryController pcr = context.getBean(PrimaryController.class);
		System.out.println(pcr.getPrimaryController());
		
		BikeBajaj bbj = context.getBean(BikeBajaj.class);
		System.out.println(bbj.VehicleType() + " " + bbj.EngineCC() + " " + bbj.VehicleBrand());
		
		CarMahindra cmda = context.getBean(CarMahindra.class);
		System.out.println(cmda.VehicleType() + " " + cmda.EngineCC() + " " + cmda.VehicleBrand());
	}

}
