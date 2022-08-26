package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint319 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the number between 1 and 100");
		double number = input.nextDouble() ;
		System.out.println((1<number) && (number<100)||(number<0));
		
	}

}
