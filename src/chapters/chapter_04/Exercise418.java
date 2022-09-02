package chapters.chapter_04;

import java.util.Scanner;

public class Exercise418 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters :");
		String letters = input.next();

		letters = letters.toUpperCase();
		
		String letter1 = letters.substring(0, 1);
	
		String letter2 = letters.substring(1, 2);
		
		switch (letter1) {
		case "M":
			System.out.print("Mathematics");
			break;
		case "C":
			System.out.print("Computer Science");
			break;
		case "I":
			System.out.print("Information Technology");break;
			default : System.out.print("Invalid input");
			System.exit(0);

		}
		switch (letter2) {
		case "1":
			System.out.println(" Freshman");
			break;
		case "2":
			System.out.println(" Sophmore");
			break;
		case "3":
			System.out.println(" Junior");
			break;
		case "4":
			System.out.println(" Senior");break;
			default : System.out.print("Invalid input");

		}

		
	}


}