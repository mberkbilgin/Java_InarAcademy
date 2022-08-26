package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint312 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int count = input.nextInt();
		boolean even = count % 10 == 0;
		System.out.println(even);
		
	}

}