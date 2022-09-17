package chapters.chapter_05.Listing;

import java.util.Scanner;

public class Exercise536 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer :");
		String number = input.nextLine();
		int d10 = 0;
		for(int i = 0; i <9; i++) {
			d10 += Integer.parseInt(number.charAt(i)+"")*(i+1) ;
			
		}
		
		d10 %= 11 ;
		
		System.out.println("ISBN-10 number is "+number+d10);

		
		
	}

}