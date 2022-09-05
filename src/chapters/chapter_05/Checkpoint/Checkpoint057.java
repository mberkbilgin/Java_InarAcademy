package chapters.chapter_05.Checkpoint;

import java.util.Scanner;

public class Checkpoint057 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number;
		do {
			System.out.println("Enter an integer " + "(the input ends if it is 0)");
			number = input.nextInt();
			sum += number;
		} while (number != 0);

		System.out.println("sum is " + sum);
	}
}