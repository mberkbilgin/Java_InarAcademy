package chapters.chapter_04;

import java.util.Scanner;

public class Exercise049 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String ch = input.next() ;
		char x = ch.charAt(0);
		int y = x ;
		
		System.out.println("The Unicode for the character "+ch+" is "+y);
		
		
	}

}
