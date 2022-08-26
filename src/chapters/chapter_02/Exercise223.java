package chapters.chapter_02;

import java.util.Scanner;

public class Exercise223 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the driving distance :");
		double dist = input.nextDouble();
		System.out.println("Enter miles per gallon :");
		double milesPerGallon = input.nextDouble() ;
		System.out.println("Enter price per gallon :");
		double price = input.nextDouble() ;
		double cost = (int)((dist / milesPerGallon) * price * 100) / 100.0 ;
		System.out.println("The cost of driving is $" + cost);
	}

}
