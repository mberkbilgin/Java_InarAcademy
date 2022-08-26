package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint334 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = input.nextInt();
		System.out.println((age >= 16) ? "Ticket price is = 20." : "Ticket price is 10.");
		
		
	}

}
