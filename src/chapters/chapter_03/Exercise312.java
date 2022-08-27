package chapters.chapter_03;

import java.util.Scanner;

public class Exercise312 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter a three-digit integer :");
		int number = input.nextInt();
		int d1 = number / 100 ;
		int d2 = number / 10 % 10 ;
		int d3 = number % 10 ;
		
		if (d1 == d3 ) {
			System.out.println(number + " is a palindone.");
			
		} else {
			System.out.println(number+ " is not a palindone.");
		}
	}

}
