package chapters.chapter_03;

import java.util.Scanner;

public class Exercise032 {

	public static void main(String[] args) {
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		int number3 = (int) (System.currentTimeMillis() / 4 % 10);

		Scanner input = new Scanner(System.in);

		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " = ?");
		int answer = input.nextInt();

		if (number1 + number2 + number3 == answer) {
			System.out.println("TRUE!!");
		} else {
			System.out.println("FALSE :(( The answer is " + (number1 + number2 + number3));
		}

	}

}
