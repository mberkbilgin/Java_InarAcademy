package chapters.chapter_03;

import java.util.Scanner;

public class Exercise324 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to pick a card from desk ? (1 for Yes, 2 for No)");
		int answer = input.nextInt();
		int number = (int) (Math.random() * 5);
		int number2 = (int) (Math.random() * 14);
		if (answer == 1) {
			switch (number % 4) {
			case 0: 
				if (number2 == 0) {
					System.out.println("The card you picked is Ace of Clubs.");
				} else if (number2 == 1) {
					System.out.println("The card you picked is 2 of Clubs.");
				} else if (number2 == 2) {
					System.out.println("The card you picked is 3 of Clubs.");
				} else if (number2 == 3) {
					System.out.println("The card you picked is 4 of Clubs.");
				} else if (number2 == 4) {
					System.out.println("The card you picked is 5 of Clubs.");
				} else if (number2 == 5) {
					System.out.println("The card you picked is 6 of Clubs.");
				} else if (number2 == 6) {
					System.out.println("The card you picked is 7 of Clubs.");
				} else if (number2 == 7) {
					System.out.println("The card you picked is 8 of Clubs.");
				} else if (number2 == 8) {
					System.out.println("The card you picked is 9 of Clubs.");
				} else if (number2 == 9) {
					System.out.println("The card you picked is 10 of Clubs.");
				} else if (number2 == 10) {
					System.out.println("The card you picked is Jack of Clubs.");
				} else if (number2 == 11) {
					System.out.println("The card you picked is Quenn of Clubs.");
				} else if (number2 == 12) {
					System.out.println("The card you picked is King of Clubs.");
				} break ;
			case 1:
				if (number2 == 0) {
					System.out.println("The card you picked is Ace of Diamonds.");
				} else if (number2 == 1) {
					System.out.println("The card you picked is 2 of Diamonds.");
				} else if (number2 == 2) {
					System.out.println("The card you picked is 3 of Diamonds.");
				} else if (number2 == 3) {
					System.out.println("The card you picked is 4 of Diamonds.");
				} else if (number2 == 4) {
					System.out.println("The card you picked is 5 of Diamonds.");
				} else if (number2 == 5) {
					System.out.println("The card you picked is 6 of Diamonds.");
				} else if (number2 == 6) {
					System.out.println("The card you picked is 7 of Diamonds.");
				} else if (number2 == 7) {
					System.out.println("The card you picked is 8 of Diamonds.");
				} else if (number2 == 8) {
					System.out.println("The card you picked is 9 of Diamonds.");
				} else if (number2 == 9) {
					System.out.println("The card you picked is 10 of Diamonds.");
				} else if (number2 == 10) {
					System.out.println("The card you picked is Jack of Diamonds.");
				} else if (number2 == 11) {
					System.out.println("The card you picked is Quenn of Diamonds.");
				} else if (number2 == 12) {
					System.out.println("The card you picked is King of Diamonds.");
				} break;
			case 2: 
				if (number2 == 0) {
					System.out.println("The card you picked is Ace of Hearts.");
				} else if (number2 == 1) {
					System.out.println("The card you picked is 2 of Hearts.");
				} else if (number2 == 2) {
					System.out.println("The card you picked is 3 of Hearts.");
				} else if (number2 == 3) {
					System.out.println("The card you picked is 4 of Hearts.");
				} else if (number2 == 4) {
					System.out.println("The card you picked is 5 of Hearts.");
				} else if (number2 == 5) {
					System.out.println("The card you picked is 6 of Hearts.");
				} else if (number2 == 6) {
					System.out.println("The card you picked is 7 of Hearts.");
				} else if (number2 == 7) {
					System.out.println("The card you picked is 8 of Hearts.");
				} else if (number2 == 8) {
					System.out.println("The card you picked is 9 of Hearts.");
				} else if (number2 == 9) {
					System.out.println("The card you picked is 10 of Hearts.");
				} else if (number2 == 10) {
					System.out.println("The card you picked is Jack of Hearts.");
				} else if (number2 == 11) {
					System.out.println("The card you picked is Quenn of Hearts.");
				} else if (number2 == 12) {
					System.out.println("The card you picked is King of Hearts.");
				}break;
			case 3:
				if (number2 == 0) {
					System.out.println("The card you picked is Ace of Spades.");
				} else if (number2 == 1) {
					System.out.println("The card you picked is 2 of Spades.");
				} else if (number2 == 2) {
					System.out.println("The card you picked is 3 of Spades.");
				} else if (number2 == 3) {
					System.out.println("The card you picked is 4 of Spades.");
				} else if (number2 == 4) {
					System.out.println("The card you picked is 5 of Spades.");
				} else if (number2 == 5) {
					System.out.println("The card you picked is 6 of Spades.");
				} else if (number2 == 6) {
					System.out.println("The card you picked is 7 of Spades.");
				} else if (number2 == 7) {
					System.out.println("The card you picked is 8 of Spades.");
				} else if (number2 == 8) {
					System.out.println("The card you picked is 9 of Spades.");
				} else if (number2 == 9) {
					System.out.println("The card you picked is 10 of Spades.");
				} else if (number2 == 10) {
					System.out.println("The card you picked is Jack of Spades.");
				} else if (number2 == 11) {
					System.out.println("The card you picked is Quenn of Spades.");
				} else if (number2 == 12) {
					System.out.println("The card you picked is King of Spades.");
				}
				
				

			}

		} else if (answer == 2) {
			System.out.println("Okay, see you later.");
		} else {
			System.out.println("You entered wrong answer. Please try again.");
		}
	}

}
