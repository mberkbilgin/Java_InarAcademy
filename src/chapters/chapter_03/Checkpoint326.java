package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint326 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight : ");
		int weight = input.nextInt();
		System.out.println(weight > 50 && weight < 60);
	}

}
