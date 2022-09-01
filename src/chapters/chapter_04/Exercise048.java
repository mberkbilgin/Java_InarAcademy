package chapters.chapter_04;

import java.util.Scanner;

public class Exercise048 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int number = input.nextInt();
		char ch =(char) number  ;
		System.out.println("The character for ASCII code "+number+" is "+ch);
		
	}

}
