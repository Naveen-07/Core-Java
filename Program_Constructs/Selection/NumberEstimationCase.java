package Program_Constructs.Selection;

import java.util.Scanner;

public class NumberEstimationCase {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the iput");
		String value = scan.next();
		switch (value.length()) {
		case 1:
			System.out.println("Units");
			break ;
		case 2:
			System.out.println("Tens");
			break ;
		case 3:
			System.out.println("Hundreds");
			break ;
		case 4:
			System.out.println("Thousands");
			break ;
		case 5:
			System.out.println("Ten-Thousand");
			break ;
		default:
			System.out.println("Infinity");
			throw new IllegalArgumentException("Unexpected value: " + value);
		}
	}
}
