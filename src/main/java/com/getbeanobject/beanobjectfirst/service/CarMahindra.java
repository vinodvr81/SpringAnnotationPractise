package com.getbeanobject.beanobjectfirst.service;

public class CarMahindra implements VehicleGeneral{
	private String Vehicle_Type;
	private String Engine_CC;
	private String Vehicle_Brand;

	public CarMahindra() {
		// TODO Auto-generated constructor stub
		this.Vehicle_Type = "Four Wheeler Manual";
		this.Engine_CC = "1500 cc";
		this.Vehicle_Brand = "Mahinadra 3XO Diesel";

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
