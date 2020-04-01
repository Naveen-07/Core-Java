package Program_Constructs.Repetation;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = scan.nextInt();
		primenumberRange(range);
	}

	private static void primenumberRange(int range) {
		for (int i = 1; i < range; i++) {
			boolean flag = true;
			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(i + " ");
		}
	}
}
