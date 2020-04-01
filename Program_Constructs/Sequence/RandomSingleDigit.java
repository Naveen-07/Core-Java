package com.sequence.java;

import java.util.Random;

public class RandomSingleDigit {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println((random.nextInt(9)+1));
	}
}
