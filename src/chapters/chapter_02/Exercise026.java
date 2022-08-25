package chapters.chapter_02;

import java.util.Scanner;

public class Exercise026 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000 : ");
		
		int number = input.nextInt();
		int a = number / 100;
		int b = (number / 10) % 10;
		int c = number % 10;

		System.out.println("The sum of digits is : " +( a + b + c));
	}

}
