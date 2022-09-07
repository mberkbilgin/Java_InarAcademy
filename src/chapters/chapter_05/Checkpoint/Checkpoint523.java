package chapters.chapter_05.Checkpoint;

import java.util.Scanner;

public class Checkpoint523 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal number: ");
		int decimal = input.nextInt();
		int count = 0 ;
		String hex = "";

		while (decimal != 0) {
			int hexValue = decimal % 16;

			char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

			hex = hexDigit + hex;
			decimal = decimal / 16;
			count++ ;
		}
		System.out.println("number of transactions "+count);
		System.out.println("The hex number is " + hex);
	}

}
