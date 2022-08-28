package chapters.chapter_03;

import java.util.Scanner;

public class Exercise333 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter weight and price for package 1:");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2:");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		double c1 = weight1 / price1 ;
		double c2 = weight2 / price2 ;
		if (c1 > c2) {
			System.out.println("Package 1 has a better price.");
		}else if (c1 == c2) {
			System.out.println("Two packages have the same price.");
		}else if (c1 < c2) {
			System.out.println("Package 2 has a better price.");
		}
		
		
	}

}
