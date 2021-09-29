package com.day5programs;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String args[]) {
		int n1, n2, temp;
		System.out.println("Enter numbers");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println("Before Swapping==> " + n1 + "  " + n2);
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After  Swapping==> " + n1 + "  " + n2);

	}

}
