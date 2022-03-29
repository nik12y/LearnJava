package com.findWeekDays;

import java.util.Scanner;

public class OperationOnWeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit = 0;

		while (exit == 0) {
			System.out.println("Please Enter the Number :-");
			int weekDays = sc.nextInt();

			System.out.println(determineNameOfDay(weekDays));
			if (weekDays > 6) {
				System.out.println(" ");
				System.out.println("Please Enter Valid Number ");
				break;
			}

			System.out.println(" ");
			int close = 0;
			while (close == 0) {
				int month = sc.nextInt();
				System.out.println(determineNameOfMonth(month));

				System.out.println("The number choosen for month is :" + month);
				if (month > 12) {
					System.out.println(" ");
					System.out.println("Please Enter Valid Number ");
					break;
				}
			}
		}

	}

	public static String determineNameOfMonth(int months) {

		switch (months) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "Septembur";
		case 10:
			return "October";
		case 11:
			return "Nuvember";
		case 12:
			return "December";
		}
		return "Invalid Number for  Getting Months!!";
	}

	public static String determineNameOfDay(int dayNumber) {
		// This is an Another Way We Can solve
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesnday";
		case 3:
			return "Wenesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}
		return "Invalid Number Selected for Days!!";

		// this is one way we can solve using object
		/*
		 * String result = ""; switch (dayNumber) { case 0: result = "Sunday"; break;
		 * case 1: result = "Monday"; break; case 2: result = "Tuesnday"; break; case 3:
		 * result = "Wenesday"; break; case 4: result = "Thursday"; break; case 5:
		 * result = "Friday"; break; case 6: result = "Saturday"; break; } return
		 * result;
		 */
	}
}
