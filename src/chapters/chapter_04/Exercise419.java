package chapters.chapter_04;

import java.util.Scanner;

public class Exercise419 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer :");
		String number = input.nextLine();
		int d1 = number.charAt(0)-48;
		int d2 = number.charAt(1)-48;
		int d3 = number.charAt(2)-48;
		int d4 = number.charAt(3)-48;
		int d5 = number.charAt(4)-48;
		int d6 = number.charAt(5)-48;
		int d7 = number.charAt(6)-48;
		int d8 = number.charAt(7)-48;
		int d9 = number.charAt(8)-48;
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		System.out.println("The ISBN-10 number is : " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);

	


	}

}
