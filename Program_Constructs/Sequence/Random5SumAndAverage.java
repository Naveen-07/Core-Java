package com.sequence.java;

import java.util.Random;

public class Random5SumAndAverage {
	public static void main(String[] args) {
		Random random = new Random();
		int number;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			number = (random.nextInt(9) + 1);
			System.out.println("Random Number is : " + number);
			sum += number;
		}
		System.out.println("Sum of 5 Random is : " + sum);
		System.out.println("Avrerage is : " + (float)sum / 5);
	}
}
