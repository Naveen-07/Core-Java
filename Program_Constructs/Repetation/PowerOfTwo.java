package Program_Constructs.Repetation;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number n");
		Long number = Long.parseLong(args[0]);
		System.out.print(poweroftwo(number));
	}

	private static long poweroftwo(Long number) {

		long power = 1;
		for (int i = 0; i < number; i++) {
			power = power * 2;
		}
		return power;
	}
}
