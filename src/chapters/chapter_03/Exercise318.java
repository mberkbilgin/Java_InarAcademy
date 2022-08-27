package chapters.chapter_03;

import java.util.Scanner;

public class Exercise318 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight of your package :");
		double weight = input.nextDouble();

		if (0 < weight && weight <= 1) {
			System.out.println("Shipping cost is $" + (3.5 * weight));
		} else if (1 < weight && weight <= 3) {
			System.out.println("Shipping cost is $" + (5.5 * weight));
		} else if (3 < weight && weight <= 10) {
			System.out.println("Shipping cost is $" + (8.5 * weight));
		} else if (10 < weight && weight <= 20) {
			System.out.println("Shipping cost is $" + (10.5 * weight));
		}else System.out.println("The package cannot be shipped.");
	}

}
