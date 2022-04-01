package com.inheitance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("Nikhil");
		student.setEmailId("nik23234");
		student.setSubject("Science");
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(student.getEmailId());
		System.out.println(student.getSubject());
	}
}
