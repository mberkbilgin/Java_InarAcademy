package chapters.chapter_04;

import java.util.Scanner;

public class Exercise414 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade : (A, B, C, D, F)");
		String letter = input.next();
		
		if (letter.length() != 1) {
			System.out.println("ENTER EXACTLY ONE CHARACTER!");}
		
		else {
		letter = letter.toUpperCase();
		
		char ch = letter.charAt(0);
		
				
		if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F') {
			switch (ch) {
			case 'A' : System.out.println("The numeric value for grade "+ch+" is 4"); break;
			case 'B' : System.out.println("The numeric value for grade "+ch+" is 3"); break;
			case 'C' : System.out.println("The numeric value for grade "+ch+" is 2"); break;
			case 'D' : System.out.println("The numeric value for grade "+ch+" is 1"); break;
			case 'F' : System.out.println("The numeric value for grade "+ch+" is 0"); break;
			}
		}else System.out.println(ch+" is an invalid grade");
		
	}
	}
}
