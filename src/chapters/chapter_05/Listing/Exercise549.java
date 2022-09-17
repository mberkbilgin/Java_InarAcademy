package chapters.chapter_05.Listing;

import java.util.Scanner;

public class Exercise549 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wowels = 0;
		int consonants = 0;
		int i = 0;

		System.out.println("Enter a string: ");
		String str = input.nextLine();

		while (i != str.length()) {
			if (Character.isLetter(str.charAt(i))) {

				if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
						|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'u' || str.charAt(i) == 'U') {
					wowels++;
				} else
					consonants++;
				

			}
			i++;
		}
		System.out.println("The number of vowels is " + wowels);
		System.out.println("The number of consonants is " + consonants);
	}
}
