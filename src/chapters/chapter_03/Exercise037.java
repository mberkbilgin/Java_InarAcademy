package chapters.chapter_03;

import java.util.Scanner;

public class Exercise037 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double for example 11.56");
		double amount = input.nextDouble();
		int remainingAmount = (int) (amount * 100);
		int oneDollar = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int quarter = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int dimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int nickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int pennies = remainingAmount;

		System.out.println("Your amount " + amount + " consist of " + 
		oneDollar + (oneDollar==1 ? " dollar" : " dollars"));
		System.out.println(quarter + (quarter == 0 || quarter == 1 ? " quarter" : " quarters" ));
		System.out.println(dimes + (dimes == 0 || dimes == 1 ? " dime" : " dimes"));
		System.out.println(nickels + (nickels==00 ||nickels == 1 ? " nickel" : " nickels"));
		System.out.println(pennies + (pennies == 0 ||pennies == 1 ? " penny" : " pennies"));
		

				
				
}
	
	
	
}