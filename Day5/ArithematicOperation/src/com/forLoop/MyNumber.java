package com.forLoop;

public class MyNumber {

	private int numbers;

	public MyNumber(int number) {
		this.numbers = number;
	}

	public boolean isPrime() {
		// it can be checked by dividing the number by 2
		for (int i = 2; i <= numbers - 1; i++) {
			if (numbers % i == 0) // this is for to give the not a prime number as remainder is 0
				return false;
		}
		return true;
	}

	public int sumOfDivisors() {
		int sum = 0;
		for (int i = 2; i <= numbers - 1; i++) {
			if (numbers % i == 0)
				sum = sum + i;
		}
		return sum;
	}

	public int sumOfNumbers() {
		int sum = 0;
		for (int i = 1; i <= numbers; i++) {
			// if(numbers%i==0)
			sum = sum + i;
		}
		return sum;
	}

	public void printNumberTriangle() {
		// Here no. of rows equal to no. of columns so take j=i
		// Outer forLoop for the row
		for (int i = 1; i <= numbers; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
