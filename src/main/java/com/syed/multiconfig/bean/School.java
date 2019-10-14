package com.syed.multiconfig.bean;

public class School {
	private String name;
	private District district;
	
	public School(String name, District district) {
		super();
		this.name = name;
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", district=" + district + "]";
	}
	
}
