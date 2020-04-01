package Program_Constructs.Repetation;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		int countHead = 0, countTail = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter how many times you need to flip the coin");
		int iterations = scn.nextInt();
		if (iterations <= 0) {
			System.out.println("coin not flipped");
		} else {

			while (iterations > 0) {
				double d = Math.random();
				if (d < 0.5) {
					countHead++;
				} else {
					countTail++;
				}
				iterations--;
			}
		}
		System.out.println("head/tail is" + countHead + "/" + countTail);
	}
}
