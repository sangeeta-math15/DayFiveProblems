package com.day5programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int num = sc.nextInt();
	    String even_odd = (num % 2 == 0) ? "even" : "odd"; //Ternary Operator

	    System.out.println("The entered number "+ num + " is: " + even_odd);

	}

}
