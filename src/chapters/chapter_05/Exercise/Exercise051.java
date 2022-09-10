package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise051 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int negatives = 0;
		int positives = 0;
		double total = 0;
		double average = 0;

		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();
		while (number != 0 ) {
			if(number>0)
				positives++;
			else
				negatives++;
			total += number;
			number = input.nextInt();
		}
		
		average = total / (negatives + positives);
		
		System.out.println("The number of positives is "+positives);
		System.out.println("The number of negatives is "+negatives);
		System.out.println("The total is "+total);
		System.out.println("The average is "+average);
	}

}
