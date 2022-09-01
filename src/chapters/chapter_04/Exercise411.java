package chapters.chapter_04;

import java.util.Scanner;

public class Exercise411 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15):");
		int value = input.nextInt();
		
		if (value > 15) {
			System.out.println(value+" is an invalid input");
		}else if(value >= 0 && value < 10) {
			System.out.println("The hex value is "+value);
			
		}else { 
			switch (value%10) { 
			case 0 : System.out.println("The hex value is A"); break;
			case 1 : System.out.println("The hex value is B"); break;
			case 2 : System.out.println("The hex value is C"); break;
			case 3 : System.out.println("The hex value is D"); break;
			case 4 : System.out.println("The hex value is E"); break;
			case 5 : System.out.println("The hex value is F"); 
			}
			}
				
	}

}
