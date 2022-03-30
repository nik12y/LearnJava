package com.arrayListConcept;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class StudnetByArrayListRunner {

	public static void main(String[] args) {
	//	System.out.println("Enter the size of array :-");
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		while (exit == 0) {
			System.out.println(" ");
			System.out.println("Enter the size of array :-");
			int nextInt = sc.nextInt();

			int[] marks = new int[nextInt];
			System.out.println("Enter the Marks in an Array one by one");
			for (int i = 0; i < nextInt; i++) {
				marks[i] = sc.nextInt();
			}
		if (nextInt== -1) {
				break;
			}       // Here we actually do "name" new int []{} if it is more than that then use int... values
		StudentByArrayList student = new StudentByArrayList("Nikhil", marks);
			// Get number of marks and name of students
			int numberOfMarks = student.getNumberOfMarks();
			String nameOfStudent = student.getNameOfStudent();

			System.out.println("Name of Student :" + nameOfStudent);
			System.out.println(
					"Number of marks :" + numberOfMarks + "\n" + "Its Array Format is :" + Arrays.toString(marks));

			// sumOFStudents Marks
			int sumOfMarks = student.getSumOfMarks();
			System.out.println("Sum of Students Marks is : " + sumOfMarks);

			// getMaximum
			int maximumMarks = student.getMaximumMarks();
			System.out.println("Maximum marks of Students is :" + maximumMarks);

			// getMininum
			int minimumMarks = student.getMinimumMarks();
			System.out.println("Minimum marks of Students is :" + minimumMarks);

			// Average of Marks
			BigDecimal average = student.getAverage();
			System.out.println("Average of marks is : " + average);

			System.out.println(student);
		}
	}
}
