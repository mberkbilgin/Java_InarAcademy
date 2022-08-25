package chapters.chapter_02;

import java.util.Scanner;

public class Exercise210 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in) ;
	System.out.println("Enter the amount of water in kilograms : ");
	double amountOfwater = input.nextDouble() ;
	System.out.println("Enter the initial temperatue : ");
	double initialTempt = input.nextDouble();
	System.out.println("Enter the final temperature : ");
	double finalTempt = input.nextDouble();
	double q = amountOfwater * (finalTempt-initialTempt) * 4184 ;
	
	System.out.println("The energy needed is : " + q );
	
	}

}
