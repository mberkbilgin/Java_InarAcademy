package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint320 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("|x - 5| < 4.5");
		System.out.println("According to this expression,"
				+ " enter a value for x : ");
		double number = input.nextDouble();
		System.out.println((number-5<4.5)&&(number-5>-4.5));
	}

}
