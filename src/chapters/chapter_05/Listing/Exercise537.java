package chapters.chapter_05.Listing;

import java.util.Scanner;

public class Exercise537 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal integer: ");
		int dec = input.nextInt();
		
		String bin = "";
		for (int i = dec; i > 0; i /= 2) {
			bin = (i % 2) + bin ;
		}
		
		System.out.println("The binary value of the decimal "+dec+" is: "+bin);
		
	}

}
