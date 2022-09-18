package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise541 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		int max = input.nextInt();
		int count = 1 ;
		int number = 1;
		
		while(number != 0) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1 ;
			}
			if (number == max)
				count++;
		}
		System.out.println("The largest number is "+max);
		System.out.println("The occurrence count of the largest number is "+count);

	}
}