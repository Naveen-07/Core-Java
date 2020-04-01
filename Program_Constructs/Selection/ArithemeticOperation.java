package Program_Constructs.Selection;

import java.util.Scanner;

public class ArithemeticOperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a Value");
		double a = scan.nextDouble();
		System.out.println("Enter the a Value");
		double b = scan.nextDouble();
		System.out.println("Enter the a Value");
		double c = scan.nextDouble();
		double operation1 = (a + b * c);
		double operation2 = (a % b * c);
		double operation3 = (c + a / b);
		double operation4 = (a * b + c);
		System.out.println("a + b * c :" + operation1);
		System.out.println("a % b * c :" + operation2);
		System.out.println("c + a / b :" + operation3);
		System.out.println("a * b + c :" + operation4);
		double max=0;
		if (operation1>=operation2 && operation1>=operation3 && operation1>=operation4) {
			max=operation1;
		} 
		else if (operation2>=operation1 && operation2>=operation3 && operation2>=operation4) {
			max=operation2;
		}
		else if (operation3>=operation2 && operation3>=operation3 && operation3>=operation4) {			
			max=operation3;
		}
		else {			
			max=operation4;
		}
		System.out.println("Maximum is : "+max);
		double min = max;
		if (operation1<=operation2 && operation1<=operation3 && operation1<=operation4) {
			min=operation1;
		} 
		else if (operation2<=operation1 && operation2<=operation3 && operation2<=operation4) {
			min=operation2;
		}
		else if (operation3<=operation2 && operation3<=operation3 && operation3<=operation4) {			
			min=operation3;
		}
		else {			
			min=operation4;
		}
		System.out.println("Minimum is : "+min);
	}
}
