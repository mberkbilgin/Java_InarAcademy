package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise534 {

	public static void main(String[] args) {
		int pc ;
		int countPC = 0;
		int countUser = 0;
		Scanner input = new Scanner(System.in);
		
		int user ;
		while(countPC <= 2 && countUser <= 2) {
			System.out.println("Enter 0 for scissor, 1 for rock and 2 for paper:");
			user = input.nextInt();
			pc = (int)(Math.random()*3);
		if (user == 0 && pc == 1 || user == 1 && pc == 2 || user == 2 && pc == 0) {
			System.out.println("PC Win!");
			countPC++;
		}else if (user == 0 && pc == 2 || user == 1 && pc == 0 || user == 2 && pc == 1) {
			System.out.println("You win!");
			countUser++;
		}else {
			System.out.println("DRAW!");
		}
	}
		if (countPC < countUser ) {
			System.out.println("FINAL SCORE is "+countUser+" - "+countPC+" YOU WIN!");
		}else 
			System.out.println("FINAL SCORE is "+countPC+" - "+countUser+" PC WIN!");
		
}
}