package com.forLoop;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number;
		//Input from user
		Scanner sc = new Scanner(System.in);
		//this is for no limit to take input from user
		int exit = 0;
		
		int nextInt = 0;
		
		while (exit == 0) {// while is a infinite loop
			System.out.println("Enter the Number :");
			nextInt = sc.nextInt();
			//Here we make condition where to stop 
			if (nextInt == -1) {
				break;
			}

			 number = new MyNumber(nextInt);
			boolean isprime = number.isPrime();
			System.out.println("IsPrime " + isprime);

		}
//Call to sumOfDivisor Method		
		System.out.println("Enter the Number for sumOfDivisor:");
			nextInt = sc.nextInt();//it will print the sum of divisor who divide user number
		MyNumber num=new MyNumber(nextInt);
		int sumOfDivisiors = num.sumOfDivisors();
		System.out.println(sumOfDivisiors);
		
//Call to  sumOfNumbers Method
		System.out.println("Enter the Number for sumOfNumbers:");
		int sumOfNumbers = num.sumOfNumbers();
		//it will give the sum of number up to  user input suppose 
		// it take input as 9 it run for loop for 9 times
		System.out.println("The sum of Numbers is :"+sumOfNumbers);
		
//Call to PrintNumberTriangle
		System.out.println("Enter the Number for printNumberTriangle:");
		num.printNumberTriangle();
		
	}
	
}
