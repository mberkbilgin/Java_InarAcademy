package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise516 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		int i = 2 ;
		
		while(number / i != 1) {

			if (number % i == 0) {
				System.out.print(i+", ");
				number /= i ;
			}else
				i++ ;
		}
		System.out.print(number);
	}

}
