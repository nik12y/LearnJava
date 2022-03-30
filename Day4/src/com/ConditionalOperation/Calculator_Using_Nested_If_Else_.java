package com.ConditionalOperation;

import java.util.Scanner;

public class Calculator_Using_Nested_If_Else_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		while (exit == 0) {
			System.out.println("Enter Numer 1 :");
			int num1 = sc.nextInt();
			System.out.println("Enter Number 2 :");
			int num2 = sc.nextInt();

			System.out.println("Please Enter Your Operation :");
			System.out.println("1-Addition :");
			System.out.println("2-Substraction :");
			System.out.println("3-Multiply :");
			System.out.println("4-Division :");
			System.out.println("Please Enter 0 to exit :\n");
			System.out.println("Chose Operation Number :");
			int choice = sc.nextInt();
			
		if (choice == 0) {
		System.out.println("Exit Successfully!!");
				break;
		}	
			System.out.println("Number1 :" + num1);
			System.out.println("Number2 :" + num2);
			System.out.println("Your choice are :" + choice);

			if (choice == 1) {
				System.out.println("Addition of " + num1 + " and " + num2 + " is :" + (num1 + num2));
			} else if (choice == 2) {
				System.out.println("Substraction of " + num1 + " and " + num2 + " is :" + (num1 - num2));
			} else if (choice == 3) {
				System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" + (num1 * num2));
			} else if (choice == 4) {
				System.out.println("Division of " + num1 + " and " + num2 + " is :" + (num1 / num2));
			} else {
				System.err.println("Invalid Operation is chosen!!");
			}
		}
	}
}
