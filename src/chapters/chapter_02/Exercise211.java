package chapters.chapter_02;

import java.util.Scanner;

public class Exercise211 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of year : ");
		int year = input.nextInt() ;
		System.out.println("Population of the country at the moment : 19485769");
		System.out.println("Annual increase by estimated : 437951");
		double x = (year * 437951) + 19485769 ;
		System.out.println("The population in " + year + " years is "+ x);
	}

}
