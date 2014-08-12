package com.finance.ui.view;

public class CRForm {

	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String name;
	private String street;
	private String city;
	private String state;
	private String email;
	private String zip;

	@Override
	public String toString() {
		return "CRForm [name=" + name + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", email=" + email + ", zip=" + zip
				+ "]";
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getEmail() {
		return email;
	}

}
