package com.sequence.java;

import java.util.Random;

public class SumTwoDiceNum {
	public static void main(String[] args) {
		Random random = new Random();
		int random1 = (random.nextInt(6)+1);
		int random2 = (random.nextInt(6)+1);
		System.out.println("random1 : "+random1);
		System.out.println("random2 : "+random2);
		System.out.println("Sum of 2 Dice is : "+(random1+random2));
	}
}
