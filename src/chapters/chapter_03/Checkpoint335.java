package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint335 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your note :");
		int x = input.nextInt() ;
		int score ;
		if (x >10 ) {
			score = x * 3 ;
			System.out.println("Your score is " + score);
		} else {
			score = x * 4 ;
			System.out.println("Your score is " + score);
		}
		
		System.out.println("Enter your income : ");
		int income = input.nextInt() ;
		double tax ;
		if (income > 10000) {
			tax = income * 0.2 ; 
			System.out.println("Your tax is " +tax );
			
			
		}
			else {
				tax = income * 0.17 + 1000 ;
				System.out.println("Your tax is " +tax );
			}
		}
		
		
		
		
		
	}


