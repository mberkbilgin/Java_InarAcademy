package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise514 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int gcd = (number1 < number2) ? number1 : number2 ;
		
		while (number1 % gcd != 0 || number2 % gcd != 0) {
			gcd-- ;
			
		}
	System.out.println("The greatest common divisor for "+number1 + " and " + number2 +" is "+gcd);
	}
}