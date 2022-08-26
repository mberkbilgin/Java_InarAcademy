package chapters.chapter_02;

import java.util.Scanner;

public class Exercise222 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double for example 11.56");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount * 100) ;
		int oneDollar = remainingAmount / 100 ;
		remainingAmount = remainingAmount % 100 ;
		int quarter = remainingAmount / 25 ;
		remainingAmount = remainingAmount %25 ;
		int dimes = remainingAmount / 10 ;
		remainingAmount = remainingAmount % 10 ;
		int nickels = remainingAmount / 5 ;
		remainingAmount = remainingAmount % 5 ;
		int pennies = remainingAmount ;
		
		System.out.println("Your amount " + amount + " consist of " + oneDollar + 
				" dollars " + quarter + " quarters " + dimes + 
				" dimes " + nickels + " nickels " + pennies + " pennies.");
		
	}

}
