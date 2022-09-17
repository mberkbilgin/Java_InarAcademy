package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise538 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal integer: ");
		int dec = input.nextInt();
		String oct = "";
		
		for(int i = dec; i > 0; i/=8) {
			oct = i % 8 + oct; 
		}
		System.out.println("The octal of "+dec+" is "+oct);
	}

}
