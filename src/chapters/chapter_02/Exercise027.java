package chapters.chapter_02;

import java.util.Scanner;

public class Exercise027 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the number of minutes : ");
		int number = input.nextInt() ;
		int days = number / 60 / 24 ;
		int years = days / 365 ;
		int remainDays = days % 365 ;
		System.out.println(number + " minutes is approximately " + years + " years and " + remainDays
				+ " days."  );
		
		
		
	}

}
