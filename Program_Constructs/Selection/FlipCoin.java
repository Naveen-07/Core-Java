package Program_Constructs.Selection;

import java.util.Random;

public class FlipCoin {
	public static void main(String[] args) {
		Random random = new Random();
		if (random.nextInt() >= 0.5)
			System.out.println("Heads");
		else
			System.out.println("Tails");
	}
}
