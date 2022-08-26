package chapters.chapter_02;

import java.util.Scanner;

public class Exercise220 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter balance :");
		double balance = input.nextDouble() ;
		System.out.println("Enter interest rate : (e.g., 3 for 3%)");
		double annualInterestRate = input.nextDouble() ;
		double interest = (int)(balance * (annualInterestRate/1200)*1000)/1000.0 ;
		System.out.println("The interest is " + interest );
		
	}

}
