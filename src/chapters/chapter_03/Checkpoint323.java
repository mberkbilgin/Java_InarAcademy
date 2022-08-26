package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint323 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("x >= 50 &&  x <= 100");
		System.out.println("According to this expression, "
				+ "enter a value for x :");
		int x = input.nextInt();
		System.out.println(x >= 50 && x <= 100);
	}

}
