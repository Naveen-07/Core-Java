package Program_Constructs.Repetation;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number n");
		int number = scan.nextInt();
		System.out.print(findHarmonic(number));
	}

	private static double findHarmonic(double number) {
		double harmonic = 1;
		for (int i = 2; i <= number; i++) {
			harmonic += (double) 1 / i;
		}
		return harmonic;
	}
}
