package com.InheritanceBasic;

import java.math.BigDecimal;

public class Employer {

	private String title;
	private String employerName;
	private char employerGrade;
	private BigDecimal salary;

	// Constructor
	public Employer() {
		System.out.println("employer COnstructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployerGrade() {
		return employerGrade;
	}

	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String toString() { // this will call super class(Employer.java)
		return title + "#" + employerName + "#" + employerGrade + "#" + salary + super.toString();
	}
}
