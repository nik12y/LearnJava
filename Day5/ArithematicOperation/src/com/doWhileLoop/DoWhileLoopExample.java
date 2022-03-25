package com.doWhileLoop;

import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		int num=-1;
		Scanner sc=new Scanner(System.in);
		
		do {
			if(num!=-1)
			System.out.println("Cube is :" +num*num*num);
			
			System.out.println("Enter the Number :");
			num = sc.nextInt();
		
		}while(num>=0) ;
			System.out.println("Thanks!! Have a great Fun");
		
	}
}
