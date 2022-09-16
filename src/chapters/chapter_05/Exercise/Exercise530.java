package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise530 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount for saving : (e.g, 100)");
		double amount = input.nextDouble();
		
		System.out.println("Enter the annual interest rate : (e.g, 5)");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate /1200 ;
		
		System.out.println("Enter the number of months : (e.g, 6)");
		int month = input.nextInt();
		
		double money = 0;
		for (int i = 1; i <= month; i++) {
			  money = (int)((amount+money)*(1+monthlyRate)*100)/100.0;
		}
		System.out.println("in "+month +" month, saving amount is "+money);
		
		
		
	}

}
