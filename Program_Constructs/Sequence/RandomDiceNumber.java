package com.sequence.java;

import java.util.Random;

public class RandomDiceNumber {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println((random.nextInt(6)+1));
	}
}
