package chapters.chapter_03;

import java.util.Scanner;

public class Exercise317 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock(1), paper(2). Choose one:" );
		int answer = input.nextInt();
		int number = (int) (Math.random() * 3);
		System.out.println(number);
		if (answer == 0) {
			if (number == 0)
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");
			else if (number == 1)
				System.out.println("The computer is rock. You are scissor. Computer won.");
			else if (number == 2)
				System.out.println("The computer is paper. You are scissor. You won.");
		}
		if (answer == 1) {
			if (number == 0)
				System.out.println("The computer is scissor. You are rock . You won.");
			else if (number == 1)
				System.out.println("The computer is rock. You are rock too. It is a draw.");
			else if (number == 2)
				System.out.println("The computer is paper. You are rock. Computer won.");

		}
		if (answer == 2) {
			if (number == 0)
				System.out.println("The computer is scissor. You are paper. Computer won.");
			else if (number == 1)
				System.out.println("The computer is rock. You are paper. You won.");
			else if (number == 2)
				System.out.println("The computer is paper. You are paper. It is a draw.");

		}
	}

}
