package Program_Constructs.Repetation;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		long number = scan.nextLong();
		System.out.print(findFactorial(number));
	}

	private static long findFactorial(Long number) {

		long factor = 1;
		for (int i = 1; i <= number; i++) {
			factor = factor * i;
		}
		return factor;
	}
}
