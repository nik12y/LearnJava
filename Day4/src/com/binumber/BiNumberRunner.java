package com.binumber;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber num = new BiNumber(5, 8);
		
		System.out.println("Sum of numbers is :" + num.add()+"\n");
		
		System.out.println("The Multiplication is :" + num.multiply()+"\n");
		
		System.out.println("Getting the value of num1 " + num.getNum1()+"\n");
		
		System.out.println("Getting the value num2 " + num.getNum2()+"\n" );

	}
}
