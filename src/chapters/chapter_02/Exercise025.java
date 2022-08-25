package chapters.chapter_02;

import java.util.Scanner;

public class Exercise025 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the subtotal and a gratuity rate");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double gratuity = gratuityRate / 10 ;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
		
	
	
	}
	
}
