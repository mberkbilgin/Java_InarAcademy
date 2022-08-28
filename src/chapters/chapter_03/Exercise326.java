package chapters.chapter_03;

import java.util.Scanner;

public class Exercise326 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter a value :");
		int value = input.nextInt();
		if (value % 5 == 0  && value % 6 == 0) {System.out.println("Is "+value+"divisible by 5 and 6? true");
		
			
		}else System.out.println("Is "+value+" divisible by 5 and 6? false");
		
		if (value % 5 == 0  || value % 6 == 0) {
			System.out.println("Is "+value+" divisible by 5 or 6? true");
		}else System.out.println("Is "+value+" divisible by 5 or 6? false");
	
		if (value % 5 == 0 ^ value % 6 == 0) {
			System.out.println("Is "+value+" divisible by 5 or 6, but not both? true");
		}else System.out.println("Is "+value+" divisible by 5 or 6, but not both? false");
	}

}
