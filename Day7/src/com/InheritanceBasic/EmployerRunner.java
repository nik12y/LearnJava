package com.InheritanceBasic;

import java.math.BigDecimal;

public class EmployerRunner {

	public static void main(String[] args) {
		Employer employee = new Employer();
		employee.setTitle("IdigiCloud");
		employee.setEmployerName("Nikhil");
		employee.setSalary(new BigDecimal(59385.48));

		PersonDetails details = new PersonDetails();
		//details.setName("Rahul");
		details.setEmailId("raju@123");
		details.setPhone(946494954);
		System.out.println(employee);
		System.out.println(details);
	}
}
