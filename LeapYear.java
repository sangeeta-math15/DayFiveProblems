package com.day5programs;
public class LeapYear {
	public static void main(String args[]) {
		int year = (int) (Math.random() * 9000) + 1000;
		System.out.println(year);
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			System.out.println("Year is LeapYear");
		else
			System.out.println("Year is not LeapYear");

	}

}
