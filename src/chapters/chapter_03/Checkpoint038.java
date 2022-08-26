package chapters.chapter_03;

import java.util.Scanner;

public class Checkpoint038 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers for x and y ");
		int x = input.nextInt() ;
		int y = input.nextInt() ;
		int z ;
		if (x > 2 ) {
			if (y > 2) {
				z = x + y ;
				System.out.println("z is " + z);
			}
		}
		else
			System.out.println("x is " + x);
	}

}
