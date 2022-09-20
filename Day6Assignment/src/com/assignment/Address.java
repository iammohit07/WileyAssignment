package com.assignment;

public class Address {
	int flatNumber;
	String flatName;
	String roadName;
	String cityName;

	@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", flatName=" + flatName + ", roadName=" + roadName + ", cityName="
				+ cityName + "]";
	}

	public Address(int flatNumber, String flatName, String roadName, String cityName) {
		super();
		this.flatNumber = flatNumber;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getFlatName() {
		return flatName;
	}

	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}