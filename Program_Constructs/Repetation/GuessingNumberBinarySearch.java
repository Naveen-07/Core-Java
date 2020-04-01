package Program_Constructs.Repetation;

import java.util.Scanner;

public class GuessingNumberBinarySearch {
static 	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the range of number:");
		int range = scan.nextInt();
		int[] array = new int[range];
		for (int i = 0; i < range; i++) {
			array[i] = i;
		}
		findNumber(array);
	}

	public static void findNumber(int arr[]) {
		int lo = 0, hi = arr.length;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			System.out.println("if " + arr[mid] + " is your number enter y else N");
			String x = scan.next();
			if (x.equalsIgnoreCase("N")) {
				System.out.println("if" + arr[mid] + " is  it greater than your number enter Y else N");
				String y = scan.next();
				if (y.equalsIgnoreCase("Y"))
					lo = mid + 1;
				else
					hi = mid - 1;
			} else {
				System.out.println(" your number found. " + arr[mid] + " is your number");
				break;
			}
		}
	}
}
