package com.getbeanobject.beanobjectfirst.service;

public class AutoTVSThreeWheeler implements VehicleGeneral{

	private String Vehicle_Type;
	private String Engine_CC;
	private String Vehicle_Brand;

	public AutoTVSThreeWheeler() {
		// TODO Auto-generated constructor stub

		this.Vehicle_Type = "Three Wheeler";
		this.Engine_CC = "220 cc";
		this.Vehicle_Brand = "TVS King Duramax Plus";

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
