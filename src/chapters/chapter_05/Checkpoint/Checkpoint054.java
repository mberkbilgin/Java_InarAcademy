package chapters.chapter_05.Checkpoint;

import java.util.Scanner;

public class Checkpoint054 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, max ;
		System.out.println("Enter an integer (the input ends if it is 0)");
		number = input.nextInt();
		max = number ;
		
		while (number != 0) {
			System.out.println("Enter an integer (the input ends if it is 0)");
			number = input.nextInt();
			if (number > max)
				max = number ;
			}
		System.out.println("max is "+max);
		System.out.println("\nnumber is "+number);
	
	
	}
	
	

}
