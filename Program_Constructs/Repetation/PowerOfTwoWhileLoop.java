package Program_Constructs.Repetation;

import java.util.Scanner;

public class PowerOfTwoWhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of power of 2 ");
		int n = scan.nextInt();
		double d = Math.pow(2, n);
		int i = 1;
		while (Math.pow(2, i) <= d) {
			System.out.print((int) Math.pow(2, i) + " ");
			i++;
		}
	}
}
