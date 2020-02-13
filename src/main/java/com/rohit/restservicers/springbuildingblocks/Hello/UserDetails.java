package com.rohit.restservicers.springbuildingblocks.Hello;

public class UserDetails {
	private String FirstName;
	private String LastName;
	private String City;
	
	
	
	public UserDetails(String firstName, String lastName, String city) {
		//super();
		FirstName = firstName;
		LastName = lastName;
		City = city;
	}
	
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}



	@Override
	public String toString() {
		return "UserDetails [FirstName=" + FirstName + ", LastName=" + LastName + ", City=" + City + "]";
	}
	
	
	
	

}
