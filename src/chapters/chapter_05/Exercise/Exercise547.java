package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise547 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string");
		String str  = input.nextLine();
		
		int k = 0 ;
		
		for (int i = 0; i < str.length(); i++) {
			k += i % 2 == 0 ? 3 * Integer.parseInt(str.charAt(i)+"") : Integer.parseInt(str.charAt(i)+"") ;
		}
		k = 10 - k % 10;
		
		System.out.println("The ISBN-13 number is "+ str + (k == 10 ? 0 : k));
		
		if (str.length() != 12) {
			System.out.println(str + " is an invalid input");
	}
	}
}
