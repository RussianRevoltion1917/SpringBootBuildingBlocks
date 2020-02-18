package com.rohit.restservicers.springbuildingblocks.Entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	@Column(name="USER_NAME", length=50, nullable=false,unique=true)
	private String username;
	@Column(name="FIRST_NAME", length=50, nullable=false)
	private String firstname;
	@Column(name="LAST_NAME", length=50, nullable=false)
	private String lastname;
	@Column(name="EMAIL_ID", length=50, nullable=false)
	private String email;
	@Column(name="ROLL", length=50, nullable=false)
	private String roll;
	@Column(name="SSN", length=50, nullable=false,unique=true)
	private String ssn;
	

	public User() {
		
	}


	public User(long id, String username, String firstname, String lastname, String email, String roll, String ssn) {
		
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.roll = roll;
		this.ssn = ssn;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRoll() {
		return roll;
	}


	public void setRoll(String roll) {
		this.roll = roll;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", roll=" + roll + ", ssn=" + ssn + "]";
	}
	
	
	
	
	
	
}
