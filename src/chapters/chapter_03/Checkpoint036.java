package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint036 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your score :");
		int score = input.nextInt();

		if (score > 90) {
			System.out.println("Congratulations! Pay increases by %3.");
		}
		else {System.out.println("Pay increased by %1.");
			
		
		}
	}

}
