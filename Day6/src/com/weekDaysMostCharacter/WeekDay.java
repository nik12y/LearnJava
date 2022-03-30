package com.weekDaysMostCharacter;

public class WeekDay {

	public static void main(String[] args) {
		// Create String Array
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println(daysOfWeek);
		// Now find Most of Character in week days
		// use forEach loop
		String daysWithMostCharcater = "";
		
		for (String day : daysOfWeek) {
			if (day.length() > daysWithMostCharcater.length()) {
				daysWithMostCharcater = day;
			}
		}
		System.out.println(daysWithMostCharcater);
		System.out.println(" ");
		System.out.println("This will print in sequence");
		for(int i=0;i<daysOfWeek.length;i++) {
			System.out.println(daysOfWeek[i]);
		}
		System.out.println( );
		System.out.println("print the String in reverse ");
		//Now to resvers the String 
		for(int i=daysOfWeek.length-1;i>=0;i--) {
			System.out.println(daysOfWeek[i]);
		}
		
	}
}
