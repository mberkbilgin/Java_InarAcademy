package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise531 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount for saving : (e.g, 100)");
		double amount = input.nextDouble();
		
		System.out.println("Enter the annual interest rate : (e.g, 5)");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate /1200 ;
		
		System.out.println("Enter the number of months : (e.g, 6)");
		int month = input.nextInt();
		
		System.out.println("Month   CD Value");
		
		for (int i = 1; i <= month; i++) {
			  amount = amount+(amount*monthlyRate);
			 
			  System.out.printf("%-8d%.2f\n", i, amount);
			  
		}
		
		
	}

}
