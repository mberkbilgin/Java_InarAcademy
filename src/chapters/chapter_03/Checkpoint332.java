package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint332 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the day of the week : (e.g, 1, 5, 7)");
		int day = input.nextInt();
		switch (day % 7) {
		case 0 :
			System.out.println("Today is Sunday."); break ;
		case 1 :
			System.out.println("Today is Monday."); break ;
		case 2 :
			System.out.println("Today is Tuesday."); break ;
		case 3 :
			System.out.println("Today is Wednesday."); break ;
		case 4 :
			System.out.println("Today is Thursday."); break ;
		case 5 :
			System.out.println("Today is Friday."); break ;
		case 6 :
			System.out.println("Today is Saturday."); 
	
		
		}
	}

}
