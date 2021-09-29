package com.day5programs;

public class FlipCoin {

	public static void main(String[] args) {

		int coin = (int) (Math.floor(Math.random() * 10) % 2);
		int count;
		if (coin == 1) {
			System.out.println("Head");
			count = 1;
			//int percentage = count / 2;

		} else {
			System.out.println("Tail");
			count = 1;
		}

		int percentage = (count * 100) / 2;
		System.out.println("percentage of tail==>" + percentage);

	}

}
