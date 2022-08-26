package chapters.chapter_02;

import java.util.Scanner;

public class Exercise221 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter investment amount : ");
		double investmentAmount = input.nextDouble() ;
		System.out.println("Enter annual interest rate in percentage :");
		double annualInterestRate = input.nextDouble() ;
		double monthlyInterestRate = annualInterestRate / 1200 ;
		System.out.println("Enter number of years :");
		double years = input.nextDouble();
		double accumulatedValue = (int)(investmentAmount *  Math.pow(1 + monthlyInterestRate, years * 12)*100)/100.0;
		System.out.println("Accumlulated value is $" + accumulatedValue);
		
	
	}

}
