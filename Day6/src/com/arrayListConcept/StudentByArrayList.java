package com.arrayListConcept;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentByArrayList {

	private ArrayList<Integer> totalmarks = new ArrayList<Integer>();
	private String name;

	public StudentByArrayList(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.totalmarks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return totalmarks.size();
	}

	public String getNameOfStudent() {
		return name;
	}

	public int getSumOfMarks() {
		int sum = 0;
		for (int mark : totalmarks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		return Collections.max(totalmarks);
	}

	public int getMinimumMarks() {
		return Collections.min(totalmarks);
	}

	public BigDecimal getAverage() {
		int sum = getSumOfMarks();
		int number = getNumberOfMarks();
		// This is for interger value i want all value like float and double,Integer;
		// return new BigDecimal(sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);

	}
	public String toString() {
		return name + totalmarks;
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

