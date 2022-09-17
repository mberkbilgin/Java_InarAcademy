package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise532 {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		while (x == y) {
			y = (int) (Math.random() * 10);
		}

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your guess: ");
		int guess = input.nextInt();
		
		int guessd1 = guess / 10 ;
		int guessd2 = guess % 10 ;
		
		if(guessd1==x && guessd2==y) 
			System.out.println("Exact match: you win $10,000");
			else if (guessd2 == x
					&& guessd1 == y)
				System.out.println("Match all digits: you win $3,000");
			else if (guessd1 == x
					|| guessd1 == y
					|| guessd2 == x
					|| guessd2 == y)
				System.out.println("Match one digit: you win $1,000");
			else
				System.out.println("Sorry, no match");
			
		}
		
		
	}


