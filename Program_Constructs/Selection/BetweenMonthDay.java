package Program_Constructs.Selection;

import java.util.Scanner;

public class BetweenMonthDay {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Month");
	int month= scan.nextInt();
	System.out.println("enter the day");
	int day= scan.nextInt();
	if (month == 3 && day > 20  && day < 31 || month == 4 && day > 1 && day < 30 || month == 5 && day > 1 && day < 31 || month == 6 && day > 1 && day < 19 ) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
}
}
