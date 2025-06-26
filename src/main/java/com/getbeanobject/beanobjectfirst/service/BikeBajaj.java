package com.getbeanobject.beanobjectfirst.service;

public class BikeBajaj implements VehicleGeneral{

	private String Vehicle_Type;
	private String Engine_CC;
	private String Vehicle_Brand;

	public BikeBajaj() {
		// TODO Auto-generated constructor stub

		this.Vehicle_Type = "Two Wheeler";
		this.Engine_CC = "110 cc";
		this.Vehicle_Brand = "Bajaj Platina";

	}

	public String VehicleType() {
		return this.Vehicle_Type;

	}

	public String EngineCC() {
		return this.Engine_CC;
	}

	public String VehicleBrand() {
		return this.Vehicle_Brand;

	}

}
