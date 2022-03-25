package com.whileloop;

import java.util.Scanner;

public class WhileLoopExampleRun {

	public static void main(String[] args) {
		int nextInt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for setting the Limit :");
		nextInt = sc.nextInt();

		WhileLoopExample num = new WhileLoopExample(nextInt);
		System.out.println("Enter Number for squaring the numbers :");
		
		num.printSquaresUptolimit();
		
		System.out.println("Enter Number for Cube the numbers :");
		num.printCubeUptoLimit();
	}
}
