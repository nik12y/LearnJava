package com.arraysConcept;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private int[] totalMarks;
	private String name;

	public Student(String name, int... marks) {
		this.name = name;
		this.totalMarks = marks;
	}

	public int getNumberOfMarks() {
		return totalMarks.length;
	}

	public String getNameOfStudent() {
		return name;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : totalMarks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		int maximum = Integer.MIN_VALUE;// 55,77,44,88
		for (int mark : totalMarks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMarks() {
		int minimum = Integer.MAX_VALUE;// 55,77,44,88
		for (int mark : totalMarks) {
			if (mark < minimum) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverage() {
		int sum = getSumOfMarks();
		int number = getNumberOfMarks();
		// This is for interger value i want all value like float and double,Integer;
		// return new BigDecimal(sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

	}

	public String toString() {
		// Converting Integer to String
		System.out.println(name);
		for (int i = 0; i < totalMarks.length; i++) {
			return Integer.toString(totalMarks[i]);
		}
		return null;
	}
}

//	 public static void integerToRoman(int num) {
//
//	        System.out.println("Integer: " + num);
//	        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//	        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//
//	        StringBuilder roman = new StringBuilder();
//
//	        for(int i=0;i<values.length;i++) {
//	            while(num >= values[i]) {
//	                num -= values[i];
//	                roman.append(romanLiterals[i]);
//	            }
//	        }
//	        System.out.println("Roman: " + roman.toString());
//	        System.out.println("---------------------------------------------------");
//	    }
//
//	    public static void main(String[] args) {
//	        integerToRoman(17);
//	        integerToRoman(33);
//	        integerToRoman(1023);
//	        integerToRoman(542);
//	    }
