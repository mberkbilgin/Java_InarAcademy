package chapters.chapter_05.Checkpoint;

import java.util.Scanner;

public class Checkpoint510 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number ;
		int sum = 0 ;
		int count;
		
		for (count = 0; count <5 ; count++) {
			number = input.nextInt();
			sum += number;
		}
		System.out.println("sum is "+sum);
		System.out.println("count is "+count);
		
	}

}
