package com.InheritanceBasic;

public class PersonDetails extends Object {

	private String name;
	private String emailId;
	private int phone;
	
	
	//Constructor
	public PersonDetails() {
		System.out.println("person constructor");
		//this.name=name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String toString() {
		return name+"#"+ emailId+"#"+phone+"#";
	}
}
