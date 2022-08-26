package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint325 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = input.nextInt();
		System.out.println(age > 13 && age < 18);
		
	}

}
