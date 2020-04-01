package com.sequence.java;

import java.util.Scanner;

public class HelloUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		System.out.println("Hello, "+scan.next());
	}
}
