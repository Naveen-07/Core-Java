package com.sequence.java;

public class UnitConversion {
	public static void main(String[] args) {
		System.out.println(" one feet is equal to 12 inch");
		System.out.println("For 42 inch is equal to : " + (42 / 12));
		System.out.println("Rectangular plot of 60 feet x 40 feet in meter is : ");
		double meter1=60*0.3;
		double meter2=40*0.3;
		System.out.println("Rectangular Plot in meter is "+ meter1 +" meter x "+meter2+" meter");
		System.out.println(meter1*meter2);
		System.out.println("one squareMeter is equal to 0.000247105 acres");
		System.out.println("area of 25 such plots in acres is : "+(meter1*meter2*0.000247105));
		
	}
}
