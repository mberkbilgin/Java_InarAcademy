package chapters.chapter_04;

import java.util.Scanner;

public class Exercise413 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter : ");
		String letter = input.next();
		char ch = letter.charAt(0);
		

		if (Character.isLetter(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println(ch + " is a wovel");
			} else
				System.out.println(ch + " is a consonant");
		} else
			System.out.println(ch + " is an invalid input");

	}

}
