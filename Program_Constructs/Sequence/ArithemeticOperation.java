package com.sequence.java;

import java.util.Scanner;

public class ArithemeticOperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a Value");
		double a = scan.nextDouble();
		System.out.println("Enter the a Value");
		double b = scan.nextDouble();
		System.out.println("Enter the a Value");
		double c = scan.nextDouble();
		System.out.println("a + b * c :" + (a + b * c));
		System.out.println("a % b * c :" + (a % b * c));
		System.out.println("c + a / b :" + (c + a / b));
		System.out.println("a * b + c :" + (a * b + c));
	}
}
